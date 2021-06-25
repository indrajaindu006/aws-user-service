package org.example.app.model;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Today is ur lucky day";
	}

}
