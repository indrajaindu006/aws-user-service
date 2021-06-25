package org.example.spring_annotation_ioc.fortuneModel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class CircketCoach implements Coach{
	
	private FortuneService happyFortuneService; 
	
	@Value("${coach.team}")
	private String team;

	
	
	
	public CircketCoach(FortuneService happyFortuneService) {
		super();
		this.happyFortuneService = happyFortuneService;
	}

	@Override
	public String getDailyworkOut() {
		return "Practice circket today team is:"+team;
	}

	@Override
	public String getDailyFortune() {
		return happyFortuneService.getDailyFortune();
	}

}
