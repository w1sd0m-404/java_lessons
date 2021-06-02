package com.kodlamaio.hrms.business.abstracts;

import java.util.List;

import com.kodlamaio.hrms.core.utilities.DataResult;
import com.kodlamaio.hrms.core.utilities.Result;
import com.kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {

	Result add(JobAdvertisement jobAdvertisement);
	DataResult<List<JobAdvertisement>> getAll();
	DataResult<List<JobAdvertisement>> getAllSorted();
	DataResult<List<JobAdvertisement>> getAll(int pageNo,int pageSize);
	DataResult<JobAdvertisement> getByJobAdvertisementName(String jobAdvertisementName);
	DataResult<JobAdvertisement> getByJobAdvertisementNameAndBusinessPosition(String jobAdvertisementName,int businessPositionId);
	DataResult<List<JobAdvertisement>> getByJobAdvertisementNameAndEmployer(String jobAdvertisementName,int employerId);
	DataResult<List<JobAdvertisement>> getByJobAdvertisementNameAndCity(String jobAdvertisementName,int cityId);
}
