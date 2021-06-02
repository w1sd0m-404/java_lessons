package com.kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{

	JobAdvertisement getByJobAdvertisementName(String jobAdvertisementName);
	JobAdvertisement getByJobAdvertisementNameAndBusinessPosition_BusinessPositionId(String jobAdvertisementName,int businessPositionId);
	List<JobAdvertisement> getByJobAdvertisementNameAndEmployer_EmployerId(String jobAdvertisementName,int employerId);
	List<JobAdvertisement> getByJobAdvertisementNameAndCity_CityId(String jobAdvertisementName,int cityId);
}
