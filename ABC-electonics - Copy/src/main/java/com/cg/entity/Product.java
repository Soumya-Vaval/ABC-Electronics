package com.cg.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	@Id
	private int productId;

	private String modelNumber;

	private String productName;

	private String productCategoryName;

	private LocalDate dateOfPurchase;
	
	private int warrentyYears;
	
	private LocalDate warrentyDate;
}
