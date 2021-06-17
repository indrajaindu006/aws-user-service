package com.ibm;

public class ThreadTest implements Runnable {

	public void display() {
		for (int i = 0; i < 50; i++) {
			System.out.println(i);

		}
	}

	@Override
	public void run() {
		display();

	}

}
