package org.example.app.model;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Let's play cricket";
	}

	//setter injection 
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	
	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

	public CricketCoach() {
		super();
	}

	
}
