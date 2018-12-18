package com.workout.WorkoutTracker.repo;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workout.WorkoutTracker.entity.Boulder;


public interface BoulderRepository extends JpaRepository<Boulder, Long> {

//	@Query("Select userid from Boulder")// in the () needs to match what the request is asking for. "name" variable from the Unit pojo.
//	
	List<Boulder> findByUserid(Long id);
	
	
}

	
	//List<Boulder> findByUseridContaining(Long userid);


