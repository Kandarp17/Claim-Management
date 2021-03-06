package com.claim.management.claimusermanagement.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "vehicle")
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vehicle_id")
	private int vehicleId;
	
	@Column(name = "vehicle_no")
	private String vehicleNo;
	
	@Column(name = "registration_state")
	private String registeredState;
	
	@Column(name = "vin_no")
	private String vinNo;
	
	@Column(name = "make")
	private String make;
	
	@Column(name = "model")
	private String model;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "year")
	private String year;
	
	@ManyToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
	@JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
	private Customer customer;
	
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private List<Damage> damages;
	
	public Vehicle() {
		super();
	}

	public Vehicle( String vehicleNo, String registeredState, String vinNo, String make, String model,
			String color, String year) {
		super();
		this.vehicleNo = vehicleNo;
		this.registeredState = registeredState;
		this.vinNo = vinNo;
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getRegisteredState() {
		return registeredState;
	}

	public void setRegisteredState(String registeredState) {
		this.registeredState = registeredState;
	}

	public String getVinNo() {
		return vinNo;
	}

	public void setVinNo(String vinNo) {
		this.vinNo = vinNo;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
	
	
}
