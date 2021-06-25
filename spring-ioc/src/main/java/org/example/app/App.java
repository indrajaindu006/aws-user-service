package org.example.app;
import org.example.app.model.Coach;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	try {
    		
    		@SuppressWarnings("resources")
			ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        	Coach theCoach=context.getBean("theCoach",Coach.class);
        	System.out.println(theCoach.getDailyWorkout());
        	Coach theCoach2=context.getBean("theCoach",Coach.class);
        	System.out.println(theCoach==theCoach2);
        	
    		
			
		} catch (Exception e) {
		}
    }
}
