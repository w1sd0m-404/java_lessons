package com.kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import com.kodlamaio.hrms.core.utilities.DataResult;
import com.kodlamaio.hrms.core.utilities.Result;
import com.kodlamaio.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobadvertisement")
public class JobAdvertisementController {
	private JobAdvertisementService jobAdvertService;
	public JobAdvertisementController(JobAdvertisementService jobAdvertService) {
		super();
		this.jobAdvertService = jobAdvertService;
	}

	@GetMapping("/getAll")
	public DataResult<List<JobAdvertisement>> getAll(){
		return this.jobAdvertService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement advertisement) {
		return this.jobAdvertService.add(advertisement);
	}
	
	@GetMapping("/getAllByPage")
	public DataResult<List<JobAdvertisement>> getAll(int pageNo,int pageSize){
		return this.jobAdvertService.getAll(pageNo, pageSize);
	}
	
	@GetMapping("/getAllDesc")
	public DataResult<List<JobAdvertisement>> getAllSorted(){
		return this.jobAdvertService.getAllSorted();
	}
	
	@GetMapping("/getByNameJobAdvertisement")
	public DataResult<JobAdvertisement> getByAdvertisementName(@RequestParam String advertName){
		return this.jobAdvertService.getByJobAdvertisementName(advertName);
	}
}
