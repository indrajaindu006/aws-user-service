package org.example.app.model;

public class SadFortuneService implements FortuneService{

	@Override
	public String getDailyFortune() {
		return "Today is sad day";
	}

}
