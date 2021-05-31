package com.kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kodlamaio.hrms.business.abstracts.BusinessPositionService;
import com.kodlamaio.hrms.core.utilities.DataResult;
import com.kodlamaio.hrms.core.utilities.SuccessDataResult;
import com.kodlamaio.hrms.dataAccess.abstracts.BusinessPositionDao;
import com.kodlamaio.hrms.entities.concretes.BusinessPosition;

@Service
public class BusinessPositionManager implements BusinessPositionService {
	
	private BusinessPositionDao businessPositionDao;

	@Autowired
	public BusinessPositionManager(BusinessPositionDao businessPositionDao) {
		super();
		this.businessPositionDao = businessPositionDao;
	}

	@Override
	@Transactional
	public DataResult<List<BusinessPosition>> getAll() {
		return new SuccessDataResult<List<BusinessPosition>>(this.businessPositionDao.findAll(),"İşlem başarılı. İş pozisyonları listelendi.");
	}

}
