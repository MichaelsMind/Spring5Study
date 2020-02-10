package com.mike.spring5study.coach;

import com.mike.spring5study.diet.DietService;

public class BasketballCoach implements Coach {

	private DietService myDietitian;
	
	private String myTeam;
	private String myEmailAddress;
	
	public BasketballCoach () {
		System.out.println("BasketballCoach : Inside Constructor");
	}
	
	public String getDailyWorkout() {
		return "Do 100 suicides around the court";
	}

	public String getDailyDiet() {
		return myDietitian.getDailyDiet();
	}
	
	public void setDietService(DietService dietService) {
		System.out.println("BasketballCoach : Inside setter method");
		myDietitian = dietService;
	}

	public String getTeam() {
		return myTeam;
	}

	public void setTeam(String myTeam) {
		this.myTeam = myTeam;
	}

	public String getEmailAddress() {
		return myEmailAddress;
	}

	public void setEmailAddress(String myEmailAddress) {
		this.myEmailAddress = myEmailAddress;
	}
	
}
