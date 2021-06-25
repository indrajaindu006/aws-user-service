package org.example.spring_annotation_ioc;

import org.example.spring_annotation_ioc.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		try {
			@SuppressWarnings("resources")
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			Person person = context.getBean("thePerson", Person.class);
			System.out.println(person);

			person.setPersonId(2);
			person.setFirstName("rachel");
			person.setLastName("abc");
			person.setEmail("rachel@email.com");
			person.setTeam("RCB");
			person.setCountry("NZ");
			person.setPoints(80);
			System.out.println(person);

			Person person1 = context.getBean("thePerson", Person.class);
			System.out.println(person1);

			System.out.println(person == person1);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
