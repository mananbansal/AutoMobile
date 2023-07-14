package com.ti.automobile.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ti.automobile.entity.Brands;
import com.ti.automobile.repository.BrandRepository;

import com.ti.automobile.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	private BrandRepository BrandRepository;
	
	@Override
	public List<Brands> getAllBrands() {
		
		return BrandRepository.findAll();
	}

	@Override
	public Brands getBrandById(int BrandId) {
		
		Optional<Brands> optional = BrandRepository.findById(BrandId);;
		return optional.get();
	}

	@Override
	public Brands addBrand(Brands Brands) {
		
		BrandRepository.save(Brands);
		return Brands;
	}

	@Override
	public Brands updateBrand(Brands Brands) {
		
		BrandRepository.save(Brands);
		return Brands;
	}

	@Override
	public void deleteBrand(int BrandId) {
		
		BrandRepository.deleteById(BrandId);
	}

}
