package com.google.map.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class GarageService {
	@Autowired
	@Qualifier("BeanOneCarService")
	private CarService carService;
	
	public String getCleaningTime(String car) {
		String model  = carService.getModel(car);
		return "4 hours for " + model;
	}
}
