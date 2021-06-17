package com.ibm.race;

public class PrintStringThread implements Runnable {

	private Thread thread;
	private String str1;
	private String str2;

	public PrintStringThread(String str1, String str2) {
		this.str1 = str1;
		this.str2 = str2;
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		TwoString.print(str1, str2);
	}

}
