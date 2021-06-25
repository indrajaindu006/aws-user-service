package org.example.spring_annotation_ioc.fortuneModel;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{

	@Override
	public String getDailyFortune() {
		return "Today is happy day";
	}

}
