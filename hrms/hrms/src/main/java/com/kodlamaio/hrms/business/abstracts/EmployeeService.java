package com.kodlamaio.hrms.business.abstracts;

import java.util.List;

import com.kodlamaio.hrms.entities.concretes.Employee;

public interface EmployeeService {

	List<Employee> getAll();
}
