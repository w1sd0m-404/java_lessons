package com.kodlamaio.hrms.business.abstracts;

import java.util.List;

import com.kodlamaio.hrms.entities.concretes.BusinessPosition;

public interface BusinessPositionService {

	List<BusinessPosition> getAll();
}
