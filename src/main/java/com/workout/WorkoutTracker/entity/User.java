package com.workout.WorkoutTracker.entity;

//import java.util.ArrayList;
//import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToMany;
import javax.persistence.Table;





@Entity
@Table(name= "user_database")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "user_id")
	private Long user_id;
	@Column(name= "first_name")
	private String firstname;
	@Column(name= "last_name")
	private String lastname;
	@Column(name= "favorite_gym")
	private String favgym;
	@Column(name= "height")
	private String height;
	@Column(name= "weight")
	private String weight;
	@Column(name= "age")
	private String age;
	@Column(name= "username")
	private String username;
	@Column(name= "password")
	private String password;
	
//	@ManyToMany(mappedBy = "users")
//	private List<Boulder> ride = new ArrayList<Boulder>();
	
	
	public User() {
		
	}


	public User(Long user_id, String firstname, String lastname, String favgym, String height, String weight, String age,
			String username, String password) {
		this.user_id = user_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.favgym = favgym;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.username = username;
		this.password = password;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getFavgym() {
		return favgym;
	}


	public void setFavgym(String favgym) {
		this.favgym = favgym;
	}


	public String getHeight() {
		return height;
	}


	public void setHeight(String height) {
		this.height = height;
	}
	


	public String getWeight() {
		return weight;
	}


	public void setWeight(String weight) {
		this.weight = weight;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "user_id=" + user_id + ", firstname=" + firstname + ", lastname=" + lastname + ", favgym=" + favgym
				+ ", height=" + height + ", weight=" + weight + ", age=" + age + ", username=" + username
				+ ", password=" + password;
	}
	
	
	
	
	
}
