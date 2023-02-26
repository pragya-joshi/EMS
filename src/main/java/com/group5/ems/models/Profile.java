package com.group5.ems.models;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="profile")
@Data @AllArgsConstructor
public class Profile {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private long profileId;
		private String firstName;
		private String lastName;
		private String designation;
		private String image = null;
		private String gender;
		private int age;
		private long contactNum;
		private String joiningDetails;
		private String approvalStatus;
		@OneToOne
		private Employee employee; 
		@OneToMany
		private List<Address> addresses= new ArrayList<>();
		@OneToMany
		private List<Qualification> qualifications = new ArrayList<>();
		@ManyToOne
	    private Department department;
		
}
