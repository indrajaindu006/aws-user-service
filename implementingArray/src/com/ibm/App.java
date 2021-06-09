package com.ibm;

public class App {

	private char[] ch;
	{
		ch = new char[26];
	}

	public char[] createArray() {
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char) ('A' + i);
		}
		return ch;

	}
	

	public static void main(String args[]) {
		char[] c = new App().createArray();
		// using foreach loop
		for (char ch : c) {
			System.out.print(ch);
		}
		
		System.out.println();
		System.out.println("****************************");
		// using for loop

		for (int j = 0; j < c.length; j++) {
			System.out.print(c[j]);
		}

	}
}
