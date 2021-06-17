package com.ibm.race;

public class App {

	public static void main(String[] args) {

		new PrintStringThread("Hi", " How are you");
		new PrintStringThread("I'm fine", " What about you");
		new PrintStringThread("Thank you", " So much");

	}

}
