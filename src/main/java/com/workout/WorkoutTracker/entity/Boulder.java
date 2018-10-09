package com.workout.WorkoutTracker.entity;

//import java.util.ArrayList;
//import java.util.List;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;



@Entity
@Table(name= "boulder_database")
public class Boulder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "boulderid")
	private Long boulderid;
	@Column(name = "user_id")
	private Long user_id;
	@Column(name= "num_times")
	private Long numboulder;
	@Column(name= "boulder_time")
	private String bouldertime;
	@Column(name= "boulder_difficulty")
	private String boulderdifficulty;
	//@Column(name = "user_id")
	
	@OneToOne
	@JoinColumn(name = "user_id", insertable = false, updatable = false)
	@NotFound(action = NotFoundAction.IGNORE)
	private User climbUser;

	public User getClimbUser() {
		return climbUser;
	}

	public void setClimbUser(User climbUser) {
		this.climbUser = climbUser;
	}


//	
//	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
//	@JoinTable(name = "user_climb", joinColumns = @JoinColumn(name = "boulderid"), inverseJoinColumns = @JoinColumn(name = "userid"))
//	private List<Boulder> climber = new ArrayList<Boulder>();
	
	
	public Boulder() {
	
	}
	
	public Boulder(Long user_id, Long numboulder, String bouldertime, String boulderdifficulty) {
		this.user_id = user_id;
		this.numboulder = numboulder;
		this.bouldertime = bouldertime;
		this.boulderdifficulty = boulderdifficulty;
	}


	public Boulder(Long boulderid, Long user_id, Long numboulder, String bouldertime, String boulderdifficulty, User climbUser) {
		this.boulderid = boulderid;
		this.user_id = user_id;
		this.numboulder = numboulder;
		this.bouldertime = bouldertime;
		this.boulderdifficulty = boulderdifficulty;
		this.climbUser = climbUser;
	}
	
	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public Long getBoulderid() {
		return boulderid;
	}


	public void setBoulderid(Long boulderid) {
		this.boulderid = boulderid;
	}


	public Long getNumboulder() {
		return numboulder;
	}


	public void setNumboulder(Long numboulder) {
		this.numboulder = numboulder;
	}


	public String getBouldertime() {
		return bouldertime;
	}


	public void setBouldertime(String bouldertime) {
		this.bouldertime = bouldertime;
	}


	public String getBoulderdifficulty() {
		return boulderdifficulty;
	}


	public void setBoulderdifficulty(String boulderdifficulty) {
		this.boulderdifficulty = boulderdifficulty;
	}
//	

	@Override
	public String toString() {
		return "Boulder [boulderid=" + boulderid + ", user_id=" + user_id + ", numboulder=" + numboulder
				+ ", bouldertime=" + bouldertime + ", boulderdifficulty=" + boulderdifficulty + ", climbUser="
				+ climbUser + "]";
	}



	


	
//
//
//	public Boulder(Long boulderid, Long numboulder, String bouldertime, String boulderdifficulty, User userid,
//		List<Boulder> climber) {
//	this.boulderid = boulderid;
//	this.numboulder = numboulder;
//	this.bouldertime = bouldertime;
//	this.boulderdifficulty = boulderdifficulty;
//	this.userid = userid;
//	this.climber = climber;
//}
//	
//	
//
//	public Boulder(Long boulderid, User userid, List<Boulder> climber) {
//		this.boulderid = boulderid;
//		this.userid = userid;
//		this.climber = climber;
//	}
//	
//	
//
//	public User getUserid() {
//		return userid;
//	}
//
//	public void setUserid(User userid) {
//		this.userid = userid;
//	}
//
//	public List<Boulder> getClimber() {
//		return climber;
//	}
//
//	public void setClimber(List<Boulder> climber) {
//		this.climber = climber;
//	}



	
	
	
	

}
