package com.kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="City")
public class City {
	
	public City() {}

	public City(int id, String cityName, List<JobAdvertisement> advertisements) {
		super();
		this.id = id;
		this.cityName = cityName;
		this.advertisements = advertisements;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="CityName")
	private String cityName;
	
	@OneToMany(mappedBy = "City")
	private List<JobAdvertisement> advertisements;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public List<JobAdvertisement> getAdvertisements() {
		return advertisements;
	}

	public void setAdvertisements(List<JobAdvertisement> advertisements) {
		this.advertisements = advertisements;
	}
}
