package com.kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kodlamaio.hrms.business.abstracts.SystemUserService;
import com.kodlamaio.hrms.core.utilities.DataResult;
import com.kodlamaio.hrms.core.utilities.SuccessDataResult;
import com.kodlamaio.hrms.dataAccess.abstracts.SystemUserDao;
import com.kodlamaio.hrms.entities.concretes.SystemUser;

@Service
public class SystemUserManager implements SystemUserService{
	
	private SystemUserDao systemUserDao;

	@Autowired
	public SystemUserManager(SystemUserDao systemUserDao) {
		super();
		this.systemUserDao = systemUserDao;
	}

	@Override
	@Transactional
	public DataResult<List<SystemUser>> getAll() {
		return new SuccessDataResult<List<SystemUser>>(this.systemUserDao.findAll(),"İşlem başarılı. Sistem kullanıcıları listelendi.");
	}

}
