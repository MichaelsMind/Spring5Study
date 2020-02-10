package com.mike.spring5study.mainclasses;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mike.spring5study.coach.BasketballCoach;
import com.mike.spring5study.coach.Coach;

public class SetterInjectionDemoApp {

	private static BasketballCoach myCoach;
	
	public static void main(String[] args) {
		// Used Setter injection using the basketballCoach class
		// use property to setUp the setter for the dependency injection
		// usage : <property name="[nameOfthePropertyToSet]" ref="[nameOftheBean]" or value="[literalValue]"/>
		// spring will look for the method name with "set" + [propertyName] in the class
		// will throw error if not found
		
		// load application context
			ClassPathXmlApplicationContext context = new
					ClassPathXmlApplicationContext("applicationContext.xml");
			
		// get bean from spring container
			myCoach = context.getBean("myBasketballCoach", BasketballCoach.class);
			
		// use the methods of the bean
			System.out.println(myCoach.getDailyWorkout());
			System.out.println(myCoach.getDailyDiet());
			
			System.out.println(myCoach.getEmailAddress());
			System.out.println(myCoach.getTeam());
			
		// close the context
			context.close();
	}

}
