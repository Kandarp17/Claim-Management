package com.claim.management.claimusermanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.claim.management.claimusermanagement.entity.Vehicle;
import com.claim.management.claimusermanagement.repository.InsuranceRepository;

@RestController
@RequestMapping("insurance")
public class InsurenceController {
	
	@Autowired
	private InsuranceRepository insurenceRepository;
	
	@GetMapping("{id}")
	public Vehicle getVehicle( @PathVariable int id) {
		
		return insurenceRepository.findVehicleByInsuranceId(id);
		
	}
}
