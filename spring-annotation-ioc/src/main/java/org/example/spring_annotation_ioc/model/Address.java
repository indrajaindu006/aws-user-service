package org.example.spring_annotation_ioc.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Component
public class Address {
	@Value("${address.address1}")
	private String address1;
	@Value("${address.address2}")
	private String address2;
	

}
