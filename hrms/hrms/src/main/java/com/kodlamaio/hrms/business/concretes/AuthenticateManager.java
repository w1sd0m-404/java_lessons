package com.kodlamaio.hrms.business.concretes;

import java.util.regex.Pattern;

import com.kodlamaio.hrms.business.abstracts.AuthenticateService;
import com.kodlamaio.hrms.business.abstracts.EmployeeService;
import com.kodlamaio.hrms.business.abstracts.EmployerService;
import com.kodlamaio.hrms.core.utilities.Result;
import com.kodlamaio.hrms.core.utilities.SuccessResult;
import com.kodlamaio.hrms.core.validation.ActivationCodeService;
import com.kodlamaio.hrms.entities.concretes.Employee;
import com.kodlamaio.hrms.entities.concretes.Employer;



public class AuthenticateManager implements AuthenticateService {
	
	private EmployerService employerService;
	private EmployeeService employeeService;
	private ActivationCodeService activationCodeService;
	
	public AuthenticateManager(EmployerService employerService, EmployeeService employeeService,
			ActivationCodeService activationCodeService) {
		super();
		this.employerService = employerService;
		this.employeeService = employeeService;
		this.activationCodeService = activationCodeService;
	}
	
	public static boolean isEmailValidation(String email) {
		final Pattern emailRegex = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?",Pattern.CASE_INSENSITIVE);
		return emailRegex.matcher(email).matches();
	}

	@Override
	public Result registerEmployer(Employer employer, String confirmPassword) {
		//business code
		this.employerService.add(employer);
		return new SuccessResult();
		
	}

	@Override
	public Result registerEmployee(Employee employee, String confirmPassword) {
		//business code
		this.employeeService.add(employee);
		return new SuccessResult();
	}

}
