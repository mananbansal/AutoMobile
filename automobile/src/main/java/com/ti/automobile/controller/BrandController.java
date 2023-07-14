package com.ti.automobile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ti.automobile.service.BrandService;

	@RestController
	public class BrandController {
		
		@Autowired
		private BrandService categoryService;
		
		@GetMapping("/")
		public ModelAndView Brands(Model model)
		{
			model.addAttribute("brands", categoryService.getAllBrands());
			ModelAndView MAV = new ModelAndView("index");
			return MAV;
		}
		
		@GetMapping("/test")
		public String test()
		{
			return "working";
		}

}
