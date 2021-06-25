package org.example.spring_annotation_ioc.fortuneModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach{
	
	private FortuneService SadFortuneService;
	
	@Value("${coach.team1}")
	private String team;
	
	
	
	@Autowired
	public BaseBallCoach(FortuneService sadFortuneService) {
		super();
		SadFortuneService = sadFortuneService;
	}

	@Override
	public String getDailyworkOut() {
		return "Lets play base ball team 1:"+team;
	}

	@Override
	public String getDailyFortune() {
		return SadFortuneService.getDailyFortune();
	}
	
	

}
