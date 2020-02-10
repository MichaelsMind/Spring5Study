package com.mike.spring5study.coach;

import com.mike.spring5study.diet.DietService;

public class BaseballCoach implements Coach{
	
	private DietService myDietService;
	
	public BaseballCoach( DietService dietService) {
		myDietService = dietService;
	}
	
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	public String getDailyDiet() {
		return myDietService.getDailyDiet();
	}
	
	
}
