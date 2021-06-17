package com.ibm.app;

import com.ibm.PrintThread;

public class ThreadGroupApp {

	public static void main(String[] args) {
		new PrintThread("India").start();
		new PrintThread("Us").start();
		new PrintThread("Newyork").start();

		ThreadGroup group = Thread.currentThread().getThreadGroup();
		Thread[] threadArray = new Thread[10];
		int actualSize = group.enumerate(threadArray);

		for (int i = 0; i < actualSize; i++) {
			System.out.println("Thread" + threadArray[i].getName() + "in thread group" + group.getName());

		}

	}

}
