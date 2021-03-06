package com.kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrms.business.abstracts.SystemUserService;
import com.kodlamaio.hrms.core.utilities.DataResult;
import com.kodlamaio.hrms.core.utilities.Result;
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
	
	@GetMapping("/getall")
	public DataResult<List<SystemUser>> getAll(){
		return systemUserService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody SystemUser systemUser) {
		return this.systemUserService.add(systemUser);
	}
}
