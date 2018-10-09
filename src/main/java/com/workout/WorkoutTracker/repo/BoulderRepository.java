package com.workout.WorkoutTracker.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workout.WorkoutTracker.entity.Boulder;

public interface BoulderRepository extends JpaRepository<Boulder, Long> {

	//Boulder findNumBoulderByUserid(Long user_id);

}
