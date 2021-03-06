package com.claim.management.claimusermanagement.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "damage")
public class Damage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "damage_id")
	private int damageId;
	
	@Column(name = "damage_description")
	private String damageDescription;
	
	@Column(name = "damage_url")
	private String damageUrl;
	
	@ManyToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
	private Vehicle vehicle;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade =  CascadeType.ALL)
	private Claim claim;

	public Damage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Damage(String damageDescription, String damageUrl) {
		super();
		this.damageDescription = damageDescription;
		this.damageUrl = damageUrl;
	}
	

	public int getDamageId() {
		return damageId;
	}

	public void setDamageId(int damageId) {
		this.damageId = damageId;
	}

	public String getDamageDescription() {
		return damageDescription;
	}

	public void setDamageDescription(String damageDescription) {
		this.damageDescription = damageDescription;
	}

	public String getDamageUrl() {
		return damageUrl;
	}

	public void setDamageUrl(String damageUrl) {
		this.damageUrl = damageUrl;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	
	
}
