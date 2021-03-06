package com.claim.management.claimusermanagement.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userId;
	@Column(name = "user_name")
	private String userName;
	@Column(name = "password")
	private String password;
	@Column(name = "role")
	private String role;
	
	@OneToMany(fetch = FetchType.LAZY,cascade =  CascadeType.ALL)
	private List<Claim> claims;
	
	public User() {
		super();
	}

	public User( String userName, String password, String officerType) {
		super();
		this.userName = userName;
		this.password = password;
		this.role = officerType;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getOfficerType() {
		return role;
	}

	public void setOfficerType(String officerType) {
		this.role = officerType;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<Claim> getClaims() {
		return claims;
	}

	public void setClaims(List<Claim> claims) {
		this.claims = claims;
	}

	
	
	
	
}
