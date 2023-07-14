package com.ti.automobile.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Brands {

	@Column
	private int CategoryId;

	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int BrandId;

	@Column
	private String BrandName;

	@Column
	private String BrandLogo;

	@Column
	private String BrandDesc;

}