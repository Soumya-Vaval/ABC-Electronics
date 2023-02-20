package com.cg.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class Complaint {

	@Id
	private int complaintId;

	@NotEmpty(message = "Product Model Number shouldn't be null or empty")
	@Size(min = 4,max=14,message = "Product length should be min 4 and max 14 chars")
	private String productModelNumber;

	
	private String complaintName;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "client_fk", referencedColumnName = "clientId")
	private Client client;

	@NotNull(message = "Engineer Id shouldn't be null")
	private int engineerId;

	@Enumerated(EnumType.STRING)
	private Status status;

}
