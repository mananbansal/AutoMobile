package com.ti.automobile.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ti.automobile.entity.Brands;

public interface BrandRepository extends JpaRepository<Brands, Integer> {

}