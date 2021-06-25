package org.example.spring_annotation_ioc;

import org.example.spring_annotation_ioc.fortuneModel.BaseBallCoach;
import org.example.spring_annotation_ioc.fortuneModel.CircketCoach;
import org.example.spring_annotation_ioc.fortuneModel.Coach;
import org.example.spring_annotation_ioc.fortuneModel.SwimmingCoach;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FortuneApp {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resources")
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			Coach thecoach = context.getBean("circketCoach", CircketCoach.class);
			System.out.println(thecoach.getDailyworkOut());
			System.out.println(thecoach.getDailyFortune());

			Coach thecoach1 = context.getBean("baseBallCoach", BaseBallCoach.class);
			System.out.println(thecoach1.getDailyworkOut());
			System.out.println(thecoach1.getDailyFortune());

			Coach thecoach2 = context.getBean("swimmingCoach", SwimmingCoach.class);
			System.out.println(thecoach2.getDailyworkOut());
			System.out.println(thecoach2.getDailyFortune());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
