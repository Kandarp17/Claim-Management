package com.claim.management.claimusermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claim.management.claimusermanagement.entity.Insurance;
import com.claim.management.claimusermanagement.entity.Vehicle;

public interface InsuranceRepository extends JpaRepository<Insurance, Integer> {
	
	public Vehicle findVehicleByInsuranceId(int id);
}
