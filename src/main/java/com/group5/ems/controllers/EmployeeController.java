package com.group5.ems.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.group5.ems.models.Employee;
import com.group5.ems.services.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/add")
	public String addEmployee(@RequestBody Employee employee) {
		System.out.println("in add employee post mapping");
		System.out.println(employee);
		employeeService.addEmployee(employee);
		return "ok";
	}
	@GetMapping("/get_all")
	public List<Employee> getAllEmployees() {
		List<Employee> employeeList = employeeService.findAllEmployees();
		return employeeList;
	}
	
	@GetMapping("/get/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable Long id) {
		Optional<Employee> employee = employeeService.findEmployeeById(id);
		return employee;
	}
	
	@PutMapping("/update/{id}")
	public String updateEmployeeById(@RequestBody Employee employee,@PathVariable Long id) {
		employeeService.updateEmployee(employee, id);
		return "employee updated";
	}
}


