
package com.ibm;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;

public class TreeToFile {

	public static void main(String[] args) throws IOException {
		File outputFile = new File(args[0]);
		FileWriter out = new FileWriter(outputFile);
		Set<Student> set = new TreeSet<Student>();
		Student std = new Student(UUID.randomUUID().toString(), "Indu", "Yeluri", "indu@gmai.com", 6.9);
		Student std1 = new Student(UUID.randomUUID().toString(), "Roja", "sree", "roja@gmai.com", 9.7);
		set.add(std);
		set.add(std1);
		PrintWriter writer = new PrintWriter(out);
		Iterator<Student> i = set.iterator();
		Student stud = null;
		while (i.hasNext()) {
			stud = i.next();
			writer.println(stud);
			System.out.println(stud);
		}
		writer.close();
		out.close();

	}

}
