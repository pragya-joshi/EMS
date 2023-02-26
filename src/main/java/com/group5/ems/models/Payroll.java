package com.group5.ems.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data @AllArgsConstructor
@Table(name="payroll")
public class Payroll {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long payroll_id;
	@ManyToOne(cascade = CascadeType.ALL)
	private Employee employee;
	private String name;
	private float amount;
	
	public long getPayroll_id() {
		return payroll_id;
	}
	public void setPayroll_id(long payroll_id) {
		this.payroll_id = payroll_id;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	
}
