package com.ibm.app;

import com.ibm.PrintRunnable;

public class PrintRunnableApp {

	public static void main(String[] args) {
     // 1st approach
//		PrintRunnable obj = new PrintRunnable("A");
//		Thread thread1 = new Thread(obj);
//		thread1.start();
//
//		PrintRunnable obj1 = new PrintRunnable("B");
//		Thread thread2 = new Thread(obj1);
//		thread2.start();
		
		
		//2nd approach created object in PrintRunnable constructor
		
		new PrintRunnable("A");
		new PrintRunnable("B");

	}

}
