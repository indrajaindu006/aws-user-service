package org.example.app;

import org.example.app.model.Coach;
import org.example.app.model.CricketCoach;
import org.example.app.model.SwimmingCoach;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FortuneApp {
	public static void main(String[] args) {
		@SuppressWarnings("resources")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach tempCoach= context.getBean("fortune",CricketCoach.class);
		System.out.println(tempCoach.getDailyWorkout());
		System.out.println(tempCoach.getDailyFortune());
		
	}

}
