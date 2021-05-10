package com.kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kodlamaio.hrms.entities.concretes.SystemUser;


public interface SystemUserDao extends JpaRepository<SystemUser, Integer>{

}
