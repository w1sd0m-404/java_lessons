package com.kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrms.business.abstracts.BusinessPositionService;
import com.kodlamaio.hrms.core.utilities.DataResult;
import com.kodlamaio.hrms.core.utilities.Result;
import com.kodlamaio.hrms.entities.concretes.BusinessPosition;

@RestController
@RequestMapping("/api/businessposition")
public class BusinessPositionController {

	private BusinessPositionService businessPositionService;

	@Autowired
	public BusinessPositionController(BusinessPositionService businessPositionService) {
		super();
		this.businessPositionService = businessPositionService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<BusinessPosition>> getAll(){
		return businessPositionService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody BusinessPosition position) {
		return this.businessPositionService.add(position);
	}
}
