package com.group5.ems.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group5.ems.models.Qualification;

@Repository 
public interface QualificationRepository extends JpaRepository<Qualification, Long>{
	   
}
