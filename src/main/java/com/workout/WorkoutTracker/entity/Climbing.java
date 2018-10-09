package com.workout.WorkoutTracker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "climbing_database")
public class Climbing {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "climbingid")
	private Long climbingid;
	@Column(name= "climb_date")
	private String date;
	@Column(name= "total_time")
	private String time;
	
	
	public Climbing() {
	
	}


	public Climbing(Long climbingid, String date, String time) {
		this.climbingid = climbingid;
		this.date = date;
		this.time = time;
	}


	public Long getClimbingid() {
		return climbingid;
	}


	public void setClimbingid(Long climbingid) {
		this.climbingid = climbingid;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	@Override
	public String toString() {
		return "climbingid=" + climbingid + ", date=" + date + ", time=" + time;
	}
	
	

	
}
