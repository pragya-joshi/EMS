package com.group5.ems.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="employee")
@Data @AllArgsConstructor
public class Employee {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private long emp_id;
		private String email;
		private String password;
		private boolean active;
		private String role;
		@OneToMany(cascade = CascadeType.ALL)
		private List<Profile> profiles = new ArrayList<>();
		@OneToMany(cascade = CascadeType.ALL)
		private List<Leave> leaves = new ArrayList<>();
		@OneToMany(cascade = CascadeType.ALL)
		private List<Payroll> payrolls = new ArrayList<>();
		
		public long getEmp_id() {
			return emp_id;
		}
		public void setEmp_id(long emp_id) {
			this.emp_id = emp_id;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public boolean getActive() {
			return active;
		}
		public void setActive(boolean active) {
			this.active = active;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public List<Profile> getProfiles() {
			return profiles;
		}
		public void setProfiles(List<Profile> profiles) {
			this.profiles = profiles;
		}
		public List<Leave> getLeaves() {
			return leaves;
		}
		public void setLeaves(List<Leave> leaves) {
			this.leaves = leaves;
		}
		public List<Payroll> getPayrolls() {
			return payrolls;
		}
		public void setPayrolls(List<Payroll> payrolls) {
			this.payrolls = payrolls;
		}
		
		
		
		
		
}
