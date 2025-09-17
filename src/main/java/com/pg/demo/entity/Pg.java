package com.pg.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pg {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String pgName;
	private String tenetName;
	private long number;
	private long fee;
	private int roomno;
	private String joindate;
	public Long getId() {
		return id;
	}
	public String getPgName() {
		return pgName;
	}
	public String getTenetName() {
		return tenetName;
	}
	public long getNumber() {
		return number;
	}
	public long getFee() {
		return fee;
	}
	public int getRoomno() {
		return roomno;
	}
	public String getJoindate() {
		return joindate;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setPgName(String pgName) {
		this.pgName = pgName;
	}
	public void setTenetName(String tenetName) {
		this.tenetName = tenetName;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public void setFee(long fee) {
		this.fee = fee;
	}
	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}
	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}
}
