package com.mike.spring5study.coach;

import com.mike.spring5study.diet.DietService;

public class TrackCoach implements Coach {

	private DietService myDietService;
	
	public TrackCoach( DietService dietService) {
		myDietService = dietService;
	}
	
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	public String getDailyDiet() {
		return myDietService.getDailyDiet();
	}

}
