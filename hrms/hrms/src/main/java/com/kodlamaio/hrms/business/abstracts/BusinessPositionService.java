package com.kodlamaio.hrms.business.abstracts;

import java.util.List;

import com.kodlamaio.hrms.core.utilities.DataResult;
import com.kodlamaio.hrms.entities.concretes.BusinessPosition;

public interface BusinessPositionService {

	DataResult<List<BusinessPosition>> getAll();
}
