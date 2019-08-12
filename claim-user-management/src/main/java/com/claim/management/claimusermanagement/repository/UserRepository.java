package com.claim.management.claimusermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claim.management.claimusermanagement.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	public User findByUserId(int userId);
}
