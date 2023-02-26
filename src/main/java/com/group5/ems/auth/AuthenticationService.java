package com.group5.ems.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.group5.ems.configs.JwtService;
import com.group5.ems.models.Role;
import com.group5.ems.models.User;
import com.group5.ems.repositories.UserRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class AuthenticationService {
	@Autowired
	private UserRepository repository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private JwtService jwtService;
	@Autowired
	private AuthenticationManager authenticationManager;
	
	public AuthenticationResponse register(RegisterRequest request) {
		
	    var user = User.builder()
	        .email(request.getEmail())
	        .password(passwordEncoder.encode(request.getPassword()))
	        .role(Role.USER)
	        .build();
	    repository.save(user);
	    var jwtToken = jwtService.generateToken(user);
	   
	    return AuthenticationResponse.builder()
	        .token(jwtToken)
	        .build();
	  }

	  public AuthenticationResponse authenticate(AuthenticationRequest request) {
	    authenticationManager.authenticate(
	        new UsernamePasswordAuthenticationToken(
	            request.getEmail(),
	            request.getPassword()
	        )
	    );
	    var user = repository.findByEmail(request.getEmail())
	        .orElseThrow();
	    System.out.println(user.getRole());
	    var jwtToken = jwtService.generateToken(user);
	    
	    return AuthenticationResponse.builder()
	        .token(jwtToken)
	        .build();
	  }

}
