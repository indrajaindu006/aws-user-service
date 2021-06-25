package org.example.spring_annotation_ioc.fortuneModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimmingCoach implements Coach {

	private FortuneService sadFortuneService;

	@Value("${coach.team2}")
	private String team;

	@Autowired
	public SwimmingCoach(FortuneService sadFortuneService) {
		super();
		this.sadFortuneService = sadFortuneService;
	}

	@Override
	public String getDailyworkOut() {
		return "Let's swim team 2:" + team;
	}

	@Override
	public String getDailyFortune() {
		return sadFortuneService.getDailyFortune();
	}

}
