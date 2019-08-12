package com.claim.management.claimusermanagement.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "insurance")
public class Insurance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "insurance_id")
	private int insuranceId;
	
	@OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
	@JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
	private Customer customer;
	
	@Column(name = "policy_commencement_date")
	private Date policyCommencementDate;
	
	@Column(name = "policy_end_date")
	private Date policyEndDate;
	
	@Column(name = "policy_status")
	private String policyStatus;
	
	@Column(name = "policy_type")
	private String policyType;
	
	@Column(name = "deductable")
	private String deductable;
	
	@OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
	@JoinColumn(name = "vehicle_id", referencedColumnName = "vehicle_id")
	private Vehicle vehicle;

	public Insurance() {
		super();
	}

	public Insurance(Customer customer, Date policyCommencementDate, Date policyEndDate, String policyStatus,
			String policyType, String deductable) {
		super();
		this.customer = customer;
		this.policyCommencementDate = policyCommencementDate;
		this.policyEndDate = policyEndDate;
		this.policyStatus = policyStatus;
		this.policyType = policyType;
		this.deductable = deductable;
	}

	public int getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(int insuranceId) {
		this.insuranceId = insuranceId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getPolicyCommencementDate() {
		return policyCommencementDate;
	}

	public void setPolicyCommencementDate(Date policyCommencementDate) {
		this.policyCommencementDate = policyCommencementDate;
	}

	public Date getPolicyEndDate() {
		return policyEndDate;
	}

	public void setPolicyEndDate(Date policyEndDate) {
		this.policyEndDate = policyEndDate;
	}

	public String getPolicyStatus() {
		return policyStatus;
	}

	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public String getDeductable() {
		return deductable;
	}

	public void setDeductable(String deductable) {
		this.deductable = deductable;
	}
	
	
}
