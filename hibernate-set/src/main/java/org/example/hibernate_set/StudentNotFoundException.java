package org.example.hibernate_set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class StudentNotFoundException extends RuntimeException {
	private String message;

}
