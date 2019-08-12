package com.claim.management.claimusermanagement.entity;



public class DamageImage {
	
	private byte[] fileData;
	private String damageDescription;
	private Vehicle vehicle;
	private Claim claim;
	
	
	
	public DamageImage() {
		
	}

	public DamageImage(byte[] fileData, String damageDescription, Vehicle vehicle, Claim claim) {
		this.fileData = fileData;
		this.damageDescription = damageDescription;
		this.vehicle = vehicle;
		this.claim = claim;
	}

	public byte[] getFileData() {
		return fileData;
	}

	public void setFileData(byte[] fileData) {
		this.fileData = fileData;
	}

	public String getDamageDescription() {
		return damageDescription;
	}

	public void setDamageDescription(String damageDescription) {
		this.damageDescription = damageDescription;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Claim getClaim() {
		return claim;
	}

	public void setClaim(Claim claim) {
		this.claim = claim;
	}

	
	
}
