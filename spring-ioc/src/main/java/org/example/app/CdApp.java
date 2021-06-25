package org.example.app;

import org.example.app.cdModel.InternationalCD;
import org.example.app.cdModel.SpecialEditionCD;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CdApp {

	public static void main(String[] args) {

		try {
			@SuppressWarnings("resources")
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

			InternationalCD cd = context.getBean("theCD", InternationalCD.class);
			System.out.println(cd.getDetails());
			cd.setCdId(101);
			cd.setCdName("Godzila");
			cd.setLanguage("Russian");
			System.out.println(cd.getDetails());

			SpecialEditionCD cd1 = context.getBean("theCD1", SpecialEditionCD.class);
			System.out.println(cd1.getDetails());
			cd1.setCdId(101);
			cd1.setCdName("Airindia");
			cd1.setSpecialFeature("Airindia1");
			System.out.println(cd1.getDetails());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
