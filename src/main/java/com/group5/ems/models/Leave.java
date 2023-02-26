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
@Table(name="leave")
public class Leave {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long leaveId;
	@ManyToOne(cascade = CascadeType.ALL)
	private Employee employee;
	private String startDate;
	private String endDate;
	private long leavesCount;
	public long getLeaveId() {
		return leaveId;
	}
	public void setLeaveId(long leaveId) {
		this.leaveId = leaveId;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public long getLeavesCount() {
		return leavesCount;
	}
	public void setLeavesCount(long leavesCount) {
		this.leavesCount = leavesCount;
	}
	
}
