package com.claim.management.claimusermanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.claim.management.claimusermanagement.entity.Claim;
import com.claim.management.claimusermanagement.entity.User;
import com.claim.management.claimusermanagement.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/getclaims/{agentId}")
	public List<Claim> getClaimsByAgent(@PathVariable int agentId){
		User agent= userRepository.findByUserId(agentId);
		return agent.getClaims();
	}
}
