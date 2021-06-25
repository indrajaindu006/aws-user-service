package org.example.spring_annotation_ioc.fortuneModel;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService{

	@Override
	public String getDailyFortune() {
		return "Today is ur bad day ";
	}

}
