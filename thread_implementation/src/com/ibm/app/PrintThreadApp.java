package com.ibm.app;

import com.ibm.PrintThread;

public class PrintThreadApp {
	public static void main(String[] args) {
		// First approach
//		PrintThread thread1 = new PrintThread("A");
//		thread1.start();
//		PrintThread thread2 = new PrintThread("B");
//		thread2.start();

		// 2nd approach start() in  PrintThread method
		new PrintThread("A");
		new PrintThread("B");
	}

}
