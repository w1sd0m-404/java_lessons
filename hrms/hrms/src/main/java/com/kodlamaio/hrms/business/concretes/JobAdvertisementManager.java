package com.kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import com.kodlamaio.hrms.core.utilities.DataResult;
import com.kodlamaio.hrms.core.utilities.Result;
import com.kodlamaio.hrms.core.utilities.SuccessDataResult;
import com.kodlamaio.hrms.dataAccess.abstracts.JobAdvertisementDao;
import com.kodlamaio.hrms.entities.concretes.JobAdvertisement;

public class JobAdvertisementManager implements JobAdvertisementService {

	private JobAdvertisementDao jobAdvertDao;
	
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertDao) {
		super();
		this.jobAdvertDao = jobAdvertDao;
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		return new SuccessDataResult<JobAdvertisement>(this.jobAdvertDao.save(jobAdvertisement));
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertDao.findAll());
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC,"JobAdvertisement");
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertDao.findAll(sort));
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo, pageSize);
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertDao.findAll(pageable).getContent());
	}

	@Override
	public DataResult<JobAdvertisement> getByJobAdvertisementName(String jobAdvertisementName) {
		return new SuccessDataResult<JobAdvertisement>(this.jobAdvertDao.getByJobAdvertisementName(jobAdvertisementName));
	}

	@Override
	public DataResult<JobAdvertisement> getByJobAdvertisementNameAndBusinessPosition(String jobAdvertisementName,
			int businessPositionId) {
		return new SuccessDataResult<JobAdvertisement>(this.jobAdvertDao.getByJobAdvertisementNameAndBusinessPosition_BusinessPositionId(jobAdvertisementName, businessPositionId));
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByJobAdvertisementNameAndEmployer(String jobAdvertisementName,
			int employerId) {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertDao.getByJobAdvertisementNameAndEmployer_EmployerId(jobAdvertisementName, employerId));
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByJobAdvertisementNameAndCity(String jobAdvertisementName,
			int cityId) {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertDao.getByJobAdvertisementNameAndCity_CityId(jobAdvertisementName, cityId));
	}

}
