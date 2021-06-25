package org.example.spring_annotation_ioc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Component(value = "thePerson")
@Scope(value = "prototype")
public class Person {
	@Value("1")
	private Integer personId;
	@Value("monica")
	private String firstName;
	@Value("swiss")
	private String lastName;
	@Value("monica@email.com")
	private String email;
	@Value("${person.team}")
	private String team;
	@Value("${person.country}")
	private String country;
	@Value("${person.points}")
	private Integer points;
	
	private Address address;

	
	
	//contructor injection
	@Autowired
	public Person(Address address) {
		super();
		this.address = address;
	}
	
	

}
