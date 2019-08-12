package com.claim.management.claimusermanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.claim.management.claimusermanagement.Service.AmazonClient;
import com.claim.management.claimusermanagement.entity.Damage;
import com.claim.management.claimusermanagement.entity.DamageImage;
import com.claim.management.claimusermanagement.repository.DamageRepository;

@RestController
@RequestMapping("damage")
public class DamageController {
	
	@Autowired
	private DamageRepository damageRepository;
	
	@Autowired
	private AmazonClient amazonClient;
	
	@GetMapping("/getbyclaimid/{claimId}")
	public List<Damage> getDamagesByClaimId(@PathVariable int claimId){
		return damageRepository.findAllByClaimClaimId(claimId);
	}
	
	@PostMapping("/")
	public Damage addDamage(@RequestBody Damage damage,@RequestPart(value="file") MultipartFile file) {
		String url= this.amazonClient.uploadFile(file);
		damage.setDamageUrl(url);
		return damageRepository.save(damage);
		
	}

}
