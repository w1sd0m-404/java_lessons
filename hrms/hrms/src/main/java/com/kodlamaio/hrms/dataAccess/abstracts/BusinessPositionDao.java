package com.kodlamaio.hrms.dataAccess.abstracts;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.hrms.entities.concretes.BusinessPosition;

public interface BusinessPositionDao extends JpaRepository<BusinessPosition, Integer> {

	List<BusinessPosition> findByPosition(String businessPosition);
}
