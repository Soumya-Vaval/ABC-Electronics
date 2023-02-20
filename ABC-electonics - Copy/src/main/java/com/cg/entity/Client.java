package com.cg.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Client {

	@Id
	@NotNull(message = "Client id shouldn't be null")
	private int clientId;
	
	@NotEmpty(message = "Password shouldn't be Null or Empty...!!")
	@Size(min = 4, max = 25, message = "Password should me min 4 and max 25 chars")
	private String password;
	@NotEmpty(message = "Address shouldn't be empty ")
	private String address;
	
	@NotNull(message = "Phone number shouldn't be null or empty")
	//@Size(min = 10, max=10, message = "phone number length should be min 10  and max 10")
	private Long phoneNumber;

	@OneToMany(cascade = CascadeType.MERGE)
	@JoinColumn(name = "complaints_fk")
	private List<Complaint> complaints;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_fk")
	private List<Product> product;

}
