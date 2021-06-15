package com.ibm.student;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class App {

	public static void main(String[] args) throws IOException {
		FileToCollection fileToCollection = new FileToCollection();
		Set<Student> set = fileToCollection.create();
		Iterator i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
