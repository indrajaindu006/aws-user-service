package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Book {
	private Integer bookId;
	private String bookName;
	private Double bookPrice;
	
	public void display() {
		System.out.println(bookId+"\t"+bookName+"\t"+bookPrice);
		System.out.println("\n");
	}

}
