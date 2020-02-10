package com.mike.spring5study.coach;

import com.mike.spring5study.diet.DietService;

public class SwimmingCoach implements Coach {

	private DietService myDietService;
	
	public SwimmingCoach( DietService dietService) {
		myDietService = dietService;
	}
	
	public String getDailyWorkout() {
		return "Swim freestyle stroke for 5k";
	}
	
	public String getDailyDiet() {
		return myDietService.getDailyDiet();
	}

}
