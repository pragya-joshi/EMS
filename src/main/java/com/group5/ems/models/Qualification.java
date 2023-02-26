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
@Table(name="qualification")
public class Qualification {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long qualificationId;
	@ManyToOne(cascade = CascadeType.ALL)
	private Profile profile;
	private String qualificationName;
	private int percentage;
	private String organization;
	private String file;
	
}
