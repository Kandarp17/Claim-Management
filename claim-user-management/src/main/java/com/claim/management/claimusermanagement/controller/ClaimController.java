package com.claim.management.claimusermanagement.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.claim.management.claimusermanagement.entity.Claim;
import com.claim.management.claimusermanagement.repository.ClaimRepository;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
@RequestMapping("/claim")
public class ClaimController {

	@Autowired
	private ClaimRepository claimRepository;

	@GetMapping("/getbyagent/{agentId}")
	public MappingJacksonValue getByAgentId(@PathVariable int agentId) {
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept(
				"claimId,claimAmount,amountApproved,claimStatus,claimSubmissionDate" + "claimSubmissionDate",
				"rejectionReason", "claimDescription");

		FilterProvider filters = new SimpleFilterProvider().addFilter("ClaimFilter", filter);
		MappingJacksonValue mapping = new MappingJacksonValue(claimRepository.getAllByAgentUserId(agentId));
		mapping.setFilters(filters);
		return mapping;
	}

	@GetMapping("/getbyadjuster/{adjustorId}")
	public MappingJacksonValue getByAdjusterId(@PathVariable int adjustorId) {
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept(
				"claimId,claimAmount,amountApproved,claimStatus,claimSubmissionDate" + "claimSubmissionDate",
				"rejectionReason", "claimDescription");

		FilterProvider filters = new SimpleFilterProvider().addFilter("ClaimFilter", filter);
		MappingJacksonValue mapping = new MappingJacksonValue(claimRepository.getAllByAdjusterUserId(adjustorId));
		mapping.setFilters(filters);
		return mapping;
	}

	@GetMapping("/getbycustomer/{customerId}")
	public MappingJacksonValue getByCustomerId(@PathVariable int customerId) {
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept(
				"claimId,claimAmount,amountApproved,claimStatus,claimSubmissionDate" + "claimSubmissionDate",
				"rejectionReason", "claimDescription");

		FilterProvider filters = new SimpleFilterProvider().addFilter("ClaimFilter", filter);
		MappingJacksonValue mapping = new MappingJacksonValue(claimRepository.getAllByCustomerCustomerId(customerId));
		mapping.setFilters(filters);
		return mapping;
	}

	@GetMapping("/{claimId}")
	public Optional<Claim> getClaimByID(@PathVariable int claimId) {
		return claimRepository.findById(claimId);
	}

	@PostMapping("")
	public Claim allClaim(@RequestBody Claim claim) {

		return claimRepository.save(claim);
	}
}
