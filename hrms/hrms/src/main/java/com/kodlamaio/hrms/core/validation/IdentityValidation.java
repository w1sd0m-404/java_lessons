package com.kodlamaio.hrms.core.validation;

import com.kodlamaio.hrms.MernisValidation;
import com.kodlamaio.hrms.entities.concretes.Employee;

public class IdentityValidation {

	public static boolean isValid(Employee employee) {
		MernisValidation mernis = new MernisValidation();
		return mernis.isVerified(employee);
	}
}
