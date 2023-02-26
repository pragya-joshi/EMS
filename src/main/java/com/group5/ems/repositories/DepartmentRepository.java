package com.group5.ems.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group5.ems.models.Department;

@Repository 
public interface DepartmentRepository extends JpaRepository<Department, Long>{
	   
}
