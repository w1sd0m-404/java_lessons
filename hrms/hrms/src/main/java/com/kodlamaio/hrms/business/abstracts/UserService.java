package com.kodlamaio.hrms.business.abstracts;

import java.util.List;

import com.kodlamaio.hrms.entities.concretes.User;

public interface UserService {

	List<User> getAll();
}
