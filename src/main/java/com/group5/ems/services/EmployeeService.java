package com.group5.ems.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group5.ems.models.Employee;
import com.group5.ems.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
    EmployeeRepository employeeRepository;
	
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		 System.out.println("inside employee add service ");
		 System.out.println(employee);
		 employeeRepository.save(employee);
	}
	
	public List<Employee> findAllEmployees() {
		List<Employee> employeeList = employeeRepository.findAll();
		return employeeList;
	}
	public Optional<Employee> findEmployeeById(Long id) {
		Optional<Employee> employee = employeeRepository.findById(id);
		return employee;
	}
	public Optional<Employee> updateEmployee(Employee employee,Long id) {
		Optional<Employee> dbEmployee = employeeRepository.findById(id);
		if(dbEmployee.isPresent()) {
		    Employee existingEmployee = dbEmployee.get();
		    existingEmployee.setEmail(employee.getEmail());
		    existingEmployee.setPassword(employee.getPassword());
		    existingEmployee.setActive(employee.getActive());
		    existingEmployee.setRole(employee.getRole());
		   
		} else {
		    //there is no employee in the repo with 'id'
		}
		
        return dbEmployee;
	}
}
