package com.kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrms.business.abstracts.SystemUserService;
import com.kodlamaio.hrms.entities.concretes.SystemUser;

@RestController
@RequestMapping("/api/systemuser")
public class SystemUserController {

	private SystemUserService systemUserService;

	@Autowired
	public SystemUserController(SystemUserService systemUserService) {
		super();
		this.systemUserService = systemUserService;
	}
	
	@GetMapping("/get")
	public List<SystemUser> get(){
		return systemUserService.getAll();
	}
}
