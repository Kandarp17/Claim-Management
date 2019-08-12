package com.claim.management.claimusermanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.claim.management.claimusermanagement.entity.Damage;

public interface DamageRepository extends JpaRepository<Damage, Integer>{

	List<Damage> findAllByClaimClaimId(int claimId);

}
