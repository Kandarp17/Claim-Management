package com.claim.management.claimusermanagement.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claim.management.claimusermanagement.entity.Claim;

public interface ClaimRepository extends JpaRepository<Claim, Integer>{
	
	public List<Claim> getAllByAgentUserId(int agentId);
	
	public List<Claim> getAllByAdjusterUserId(int adjusterId);
	
	public List<Claim> getAllByCustomerCustomerId(int customerId);
	
	
}
