package com.mike.spring5study.mainclasses;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mike.spring5study.coach.Coach;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the spring config file
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from the spring container
		Coach coach = context.getBean("myCoach", Coach.class);
		
		//call methods on the bean
		System.out.println( coach.getDailyWorkout());
		System.out.println(coach.getDailyDiet() );
		//close the context
		context.close();
	}

}
