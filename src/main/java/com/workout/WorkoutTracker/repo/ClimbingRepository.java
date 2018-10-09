package com.workout.WorkoutTracker.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workout.WorkoutTracker.entity.Climbing;

public interface ClimbingRepository extends JpaRepository<Climbing, Long>{
	
	

}
