package com.kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmployerConfirmedByEmployee")
public class EmployerConfirmedByEmployee {

	public EmployerConfirmedByEmployee() {}
	public EmployerConfirmedByEmployee(int id, int employerId, int employeeId, boolean isConfirmed) {
		super();
		this.id = id;
		this.employerId = employerId;
		this.employeeId = employeeId;
		this.isConfirmed = isConfirmed;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="EmployerId")
	private int employerId;
	
	@Column(name="EmployeeId")
	private int employeeId;
	
	@Column(name="IsConfirmed")
	private boolean isConfirmed;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmployerId() {
		return employerId;
	}
	public void setEmployerId(int employerId) {
		this.employerId = employerId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public boolean isConfirmed() {
		return isConfirmed;
	}
	public void setConfirmed(boolean isConfirmed) {
		this.isConfirmed = isConfirmed;
	}
}
