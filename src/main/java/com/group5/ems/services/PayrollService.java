package com.group5.ems.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group5.ems.models.Payroll;
import com.group5.ems.repositories.PayrollRepository;

@Service
public class PayrollService {

	@Autowired
    PayrollRepository payrollRepository;
	
	public void addPayroll(Payroll payroll) {
		// TODO Auto-generated method stub
		 System.out.println("inside payroll add service ");
		 System.out.println(payroll);
		 payrollRepository.save(payroll);
	}
	
	public List<Payroll> findAllPayrolls() {
		List<Payroll> payrollList = payrollRepository.findAll();
		return payrollList;
	}

}
