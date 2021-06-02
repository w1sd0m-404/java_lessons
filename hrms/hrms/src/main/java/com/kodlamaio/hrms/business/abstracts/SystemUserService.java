package com.kodlamaio.hrms.business.abstracts;

import java.util.List;

import com.kodlamaio.hrms.core.utilities.DataResult;
import com.kodlamaio.hrms.core.utilities.Result;
import com.kodlamaio.hrms.entities.concretes.SystemUser;

public interface SystemUserService {

	DataResult<List<SystemUser>> getAll();
	Result add(SystemUser systemUser);
}
