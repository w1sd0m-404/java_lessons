package com.kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ActivationCode")
public class ActivationCode {

	public ActivationCode() {}
	public ActivationCode(int id, String code, boolean isConfirmed, LocalDate confirmDate) {
		super();
		this.id = id;
		Code = code;
		this.isConfirmed = isConfirmed;
		this.confirmDate = confirmDate;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="Code")
	private String Code;
	
	@Column(name="IsConfirmed")
	private boolean isConfirmed;
	
	@Column(name="ConfirmDate")
	private LocalDate confirmDate;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public boolean isConfirmed() {
		return isConfirmed;
	}
	public void setConfirmed(boolean isConfirmed) {
		this.isConfirmed = isConfirmed;
	}
	public LocalDate getConfirmDate() {
		return confirmDate;
	}
	public void setConfirmDate(LocalDate confirmDate) {
		this.confirmDate = confirmDate;
	}
}
