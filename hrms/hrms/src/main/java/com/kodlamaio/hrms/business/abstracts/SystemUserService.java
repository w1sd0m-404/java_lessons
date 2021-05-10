package com.kodlamaio.hrms.business.abstracts;

import java.util.List;

import com.kodlamaio.hrms.entities.concretes.SystemUser;

public interface SystemUserService {

	List<SystemUser> getAll();
}
