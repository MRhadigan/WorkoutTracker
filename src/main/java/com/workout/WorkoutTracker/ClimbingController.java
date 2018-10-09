package com.workout.WorkoutTracker;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.workout.WorkoutTracker.entity.Boulder;
import com.workout.WorkoutTracker.entity.User;
import com.workout.WorkoutTracker.repo.BoulderRepository;
import com.workout.WorkoutTracker.repo.ClimbingRepository;
import com.workout.WorkoutTracker.repo.UserRepository;

@Controller
@SessionAttributes({ "sessionUser "})
public class ClimbingController {
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	BoulderRepository boulderRepo;
	
	@Autowired
	ClimbingRepository climbRepo;

	@RequestMapping("/")
	public ModelAndView index() {
		
		return new ModelAndView("index");
	}
	
	@RequestMapping("/registerpage")
	public ModelAndView registrationPage() {
		return new ModelAndView("registration");
	}
	
	@RequestMapping("/adduser")
	public ModelAndView adduser(User u) {
		System.out.println(u);
		userRepo.save(u);
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping ("/login")
	public ModelAndView loginPage() {
		return new ModelAndView("login");
	}
	
	@PostMapping("validateuser")
	public ModelAndView valUserName(@RequestParam("username") String username, 
			@RequestParam("password") String password, HttpSession session) {
		
	Optional<User> user = userRepo.findByUsernameAndPassword(username, password);
	
	if(user.isPresent()) {
		String truePassword = user.get().getPassword();
		if (truePassword.equals(password)) {
			User trueUser = user.get();
			session.setAttribute("sessionUser", trueUser);
			return new ModelAndView("climbtype", "welcome", "Welcome ");
		}
	} else {
		return new ModelAndView("index", "welcome", "Please sign up as a user");
	}
		return null;
	}
	
	@RequestMapping("/climbtype")
	public ModelAndView climbtype() {
		return new ModelAndView("climbtype");
	}
	
	@RequestMapping("/bouldering")
	public ModelAndView bouldering() {
		
		return new ModelAndView("bouldering");
	}
	

	
	
	@RequestMapping("/addboulder/{user_id}")
	public ModelAndView saveNewBouldering(@PathVariable("user_id") Long user_id, @RequestParam("numboulder") Long numboulder, 
			@RequestParam("bouldertime") String bouldertime, @RequestParam("boulderdifficulty") String boulderdifficulty, HttpSession session) {
	
		if (user_id == null) {
			return new ModelAndView("/login");
		}

	
		Boulder b1 = new Boulder(user_id, numboulder, bouldertime, boulderdifficulty);
		boulderRepo.save(b1);
		return new ModelAndView("climbtype", "addboulder", boulderRepo.findAll());
	}
	
//	@RequestMapping("/addboulder")
//	public ModelAndView addNewBouldering(@RequestParam("numboulder") Long numboulder, 
//			@RequestParam("bouldertime") String bouldertime, 
//			@RequestParam("boulderdifficulty") String boulderdifficulty, HttpSession session) {
//
//		User user = (User) session.getAttribute("sessionUser");
//		
//		Boulder b1 = new Boulder(numboulder, bouldertime, boulderdifficulty);
//		boulderRepo.save(b1);
//		System.out.println(b1);
//		return new ModelAndView("bouldering", "addboulder", boulderRepo.findAll());
//	}
	
	@RequestMapping("/toprope")
	public ModelAndView toprope() {
		
		return new ModelAndView("toprope");
	}
	
	@RequestMapping("/leadclimb")
	public ModelAndView leadClimb() {
		
		return new ModelAndView("leadclimb");
	}
	
	@RequestMapping("/progresspage")
	public ModelAndView boulderProgress() {
		
		
		return new ModelAndView("progresspage", "boulderinfo", boulderRepo.findAll());
	}
	
}
