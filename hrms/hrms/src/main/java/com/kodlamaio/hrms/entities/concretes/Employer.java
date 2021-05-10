package com.kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employer")
public class Employer {

	@Id
	@Column(name="UserId")
	private int userId;
	
	@Column(name="CompanyName")
	private String companyName;
	
	@Column(name="Website")
	private String website;
	
	@Column(name="PhoneNumber")
	private String phoneNumber;
	
	public Employer() {}
	
	public Employer(int userId, String companyName, String website, String phoneNumber) {
		super();
		this.userId = userId;
		this.companyName = companyName;
		this.website = website;
		this.phoneNumber = phoneNumber;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
