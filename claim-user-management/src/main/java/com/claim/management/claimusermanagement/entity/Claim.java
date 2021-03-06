package com.claim.management.claimusermanagement.entity;

import java.util.Date;
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

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonFilter;
@Entity
@Table(name = "claim")
@JsonFilter("ClaimFilter")
public class Claim {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "claim_id")
	private int claimId;
	
	@ManyToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
	@JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
	private Customer customer;
	
	@ManyToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
	private Insurance insurence;
	
	@Column(name = "claim_amount")
	private double claimAmount;
	
	@Column(name = "amount_approved")
	private double amountApproved;
	
	@Column(name = "claim_submission_date")
	private Date claimSubmissionDate;
	
	@Column(name = "claim_status")
	private String claimStatus;
	
	@Column(name = "rejection_reason")
	private String rejectionReason;
	
	@Column(name = "claim_description")
	private String claimDescription;
	
	@ManyToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
	@JoinColumn(name = "agent_id", referencedColumnName = "user_id")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private User agent;
	
	@ManyToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
	@JoinColumn(name = "adjuster_id", referencedColumnName = "user_id")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private User adjuster;
	
	
	@OneToMany(fetch = FetchType.LAZY, cascade =  CascadeType.ALL)
	private List<Damage> damages;
	
	@OneToMany(fetch = FetchType.LAZY, cascade =  CascadeType.ALL)
	private List<Vehicle> vehicles;

	public Claim(double claimAmount, double amountApproved, Date claimSubmissionDate, String claimStatus,
			String rejectionReason) {
		super();
		this.claimAmount = claimAmount;
		this.amountApproved = amountApproved;
		this.claimSubmissionDate = claimSubmissionDate;
		this.claimStatus = claimStatus;
		this.rejectionReason = rejectionReason;
	}

	public Claim() {
		super();
	}

	public int getClaimId() {
		return claimId;
	}

	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Insurance getInsurence() {
		return insurence;
	}

	public void setInsurence(Insurance insurence) {
		this.insurence = insurence;
	}

	public double getClaimAmount() {
		return claimAmount;
	}

	public void setClaimAmount(double claimAmount) {
		this.claimAmount = claimAmount;
	}

	public double getAmountApproved() {
		return amountApproved;
	}

	public void setAmountApproved(double amountApproved) {
		this.amountApproved = amountApproved;
	}

	public Date getClaimSubmissionDate() {
		return claimSubmissionDate;
	}

	public void setClaimSubmissionDate(Date claimSubmissionDate) {
		this.claimSubmissionDate = claimSubmissionDate;
	}

	public String getClaimStatus() {
		return claimStatus;
	}

	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}

	public String getRejectionReason() {
		return rejectionReason;
	}

	public void setRejectionReason(String rejectionReason) {
		this.rejectionReason = rejectionReason;
	}

	public User getAgent() {
		return agent;
	}

	public void setAgent(User agent) {
		this.agent = agent;
	}

	public User getAdjuster() {
		return adjuster;
	}

	public void setAdjuster(User adjuster) {
		this.adjuster = adjuster;
	}

	public String getClaimDescription() {
		return claimDescription;
	}

	public void setClaimDescription(String claimDescription) {
		this.claimDescription = claimDescription;
	}

	public List<Damage> getDamages() {
		return damages;
	}

	public void setDamages(List<Damage> damages) {
		this.damages = damages;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	
	
	
}
