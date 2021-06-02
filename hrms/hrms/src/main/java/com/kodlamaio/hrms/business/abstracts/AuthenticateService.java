package com.kodlamaio.hrms.business.abstracts;

import com.kodlamaio.hrms.core.utilities.Result;
import com.kodlamaio.hrms.entities.concretes.Employee;
import com.kodlamaio.hrms.entities.concretes.Employer;

public interface AuthenticateService {

	Result registerEmployer(Employer employer,String confirmPassword);
	Result registerEmployee(Employee employee,String confirmPassword);
	
}
