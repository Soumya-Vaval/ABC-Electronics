package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

	@Id
	private int adminId;

	@NotEmpty(message = "Password shouldn't be Null or Empty...!!")
	@Size(min = 4, max = 25, message = "Password should me min 4 and max 25 chars")
	private String password;

	@NotNull(message = "Contact number shouldn't be null or blank")
	@Column(unique = true,nullable = false)
	@Size(min = 10, max = 10, message = "Contact number should be min 10 and max 10 numbers")
	private String contactNumber;
	
	@Email
	@Size(min = 8, max = 30, message = "Email length should be min 8 and max 30 chars")
	private String email;
}
