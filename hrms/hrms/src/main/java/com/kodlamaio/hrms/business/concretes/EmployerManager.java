package com.kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kodlamaio.hrms.business.abstracts.EmployerService;
import com.kodlamaio.hrms.core.utilities.DataResult;
import com.kodlamaio.hrms.core.utilities.SuccessDataResult;
import com.kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import com.kodlamaio.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {
	
	private EmployerDao employerDao;

	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	@Transactional
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"İşlem başarılı. İş verenler listelendi.");
	}

}
