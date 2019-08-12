package com.claim.management.claimusermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claim.management.claimusermanagement.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
