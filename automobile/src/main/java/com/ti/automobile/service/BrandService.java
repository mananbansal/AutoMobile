package com.ti.automobile.service;

import java.util.List;

import com.ti.automobile.entity.Brands;

public interface BrandService {
	
	List<Brands> getAllBrands();

	Brands getBrandById(int BrandId);

	Brands addBrand(Brands Brands);

	Brands updateBrand(Brands Brands);

	void deleteBrand(int BrandId);

}
