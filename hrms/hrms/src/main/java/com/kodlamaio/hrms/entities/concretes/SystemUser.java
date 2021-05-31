package com.kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="SystemUser")
public class SystemUser {
	
	public SystemUser() {}
	
	public SystemUser(int userId, int positionId, String position) {
		super();
		this.userId = userId;
		this.positionId = positionId;
		this.position = position;
	}

	@Id
	@Column(name="UserId")
	private int userId;
	
	@Column(name="PositionId")
	private int positionId;
	
	@Column(name="Position")
	private String position;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getPositionId() {
		return positionId;
	}

	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
}
