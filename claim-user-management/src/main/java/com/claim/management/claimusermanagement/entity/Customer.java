package com.claim.management.claimusermanagement.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Past;
@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private int customerId;
	
	@Column(name = "customer_name")
	private String customerName;
	
	@Past
	@Column(name = "dob")
	private Date dob;
	
	@Column(name = "email", unique = true)
	private String email;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "contact_no", unique = true)
	private long contactNo;
	
	@Column(name = "photo_id_no")
	private String photoIdNo;
	
	@Column(name = "registration_date")
	private Date registrationDate;

	public Customer() {
		
	}

	public Customer(String customerName, @Past Date dob, String email, String address, long contactNo, String photoIdNo,
			Date registrationDate) {
		
		this.customerName = customerName;
		this.dob = dob;
		this.email = email;
		this.address = address;
		this.contactNo = contactNo;
		this.photoIdNo = photoIdNo;
		this.registrationDate = registrationDate;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getPhotoIdNo() {
		return photoIdNo;
	}

	public void setPhotoIdNo(String photoIdNo) {
		this.photoIdNo = photoIdNo;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	
	
	
}
