package com.kodlamaio.hrms.dataAccess.abstracts;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.hrms.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{

	List<Employee> findByEmail(String email);
	List<Employee> findByIdentityNumber(String identityNumber);
}
