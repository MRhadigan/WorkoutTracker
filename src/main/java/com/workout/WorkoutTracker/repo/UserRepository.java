package com.workout.WorkoutTracker.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workout.WorkoutTracker.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	Optional<User> findByUsernameAndPassword (String username, String password);

}