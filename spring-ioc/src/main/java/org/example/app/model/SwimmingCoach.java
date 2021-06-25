package org.example.app.model;

public class SwimmingCoach implements Coach {

	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Lets swim backward direction";
	}

	// constructor injection

	public SwimmingCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
