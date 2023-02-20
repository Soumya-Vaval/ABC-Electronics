package com.cg.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Engineer {

	@Id
	private int engineerId;

	@Size(min = 4, max = 25, message = "Password should be min 4 and max 25 chars")
	private String password;

	@NotEmpty(message = "Engineer name shouldn't be null or empty ...!!")
	private String engineerName;

	private String domain;

	@OneToMany
	@JoinColumn(name = "complaint_fk")
	private List<Complaint> complaints;

}
