package com.kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="JobAdvertisement")
public class JobAdvertisement {

	public JobAdvertisement() {}
	public JobAdvertisement(int id, String advertName, int employerId, int businessPositionId, int cityId,
			int salaryMax, int salaryMin, String advertDescription, int openPositionCount,
			LocalDate applicationDeadline) {
		super();
		this.id = id;
		this.advertName = advertName;
		this.employerId = employerId;
		this.businessPositionId = businessPositionId;
		this.cityId = cityId;
		this.salaryMax = salaryMax;
		this.salaryMin = salaryMin;
		this.advertDescription = advertDescription;
		this.openPositionCount = openPositionCount;
		this.applicationDeadline = applicationDeadline;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="AdvertName")
	private String advertName;
	
	@ManyToOne()
	@Column(name="EmployerId")
	private int employerId;
	
	@ManyToOne()
	@Column(name="BusinessPositionId")
	private int businessPositionId;
	
	@ManyToOne()
	@Column(name="CityId")
	private int cityId;
	
	@Column(name="SalaryMax")
	private int salaryMax;
	
	@Column(name="SalaryMin")
	private int salaryMin;
	
	@Column(name="AdvertDescription")
	private String advertDescription;
	
	@Column(name="OpenPositionCount")
	private int openPositionCount;
	
	@Column(name="ApplicationDeadline")
	private LocalDate applicationDeadline;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdvertName() {
		return advertName;
	}
	public void setAdvertName(String advertName) {
		this.advertName = advertName;
	}
	public int getEmployerId() {
		return employerId;
	}
	public void setEmployerId(int employerId) {
		this.employerId = employerId;
	}
	public int getBusinessPositionId() {
		return businessPositionId;
	}
	public void setBusinessPositionId(int businessPositionId) {
		this.businessPositionId = businessPositionId;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public int getSalaryMax() {
		return salaryMax;
	}
	public void setSalaryMax(int salaryMax) {
		this.salaryMax = salaryMax;
	}
	public int getSalaryMin() {
		return salaryMin;
	}
	public void setSalaryMin(int salaryMin) {
		this.salaryMin = salaryMin;
	}
	public String getAdvertDescription() {
		return advertDescription;
	}
	public void setAdvertDescription(String advertDescription) {
		this.advertDescription = advertDescription;
	}
	public int getOpenPositionCount() {
		return openPositionCount;
	}
	public void setOpenPositionCount(int openPositionCount) {
		this.openPositionCount = openPositionCount;
	}
	public LocalDate getApplicationDeadline() {
		return applicationDeadline;
	}
	public void setApplicationDeadline(LocalDate applicationDeadline) {
		this.applicationDeadline = applicationDeadline;
	}
}
