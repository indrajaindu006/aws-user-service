package com.ibm.app;

import com.ibm.ThreadTest;

public class App {

	public static void main(String[] args) throws InterruptedException {
		ThreadTest test = new ThreadTest();
		//create thread
		Thread thread = new Thread(test);
		System.out.println(thread.getName());
		thread.start();
		Thread thread1 = new Thread(test);
		System.out.println(thread1.getName());
		thread1.start();

	}

}
