package com.ibm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;

public class FileToCollection {

	private Set<Student> set = new TreeSet<Student>();
	File inputFile = new File("Students.txt");

	public Set<Student> create() throws IOException {
		FileReader fileReader = new FileReader(inputFile);
		BufferedReader bufferReader = new BufferedReader(fileReader);
		String line = null;
		while ((line = bufferReader.readLine()) != null) {
			String str[] = line.split(",");
			Student student = new Student();
			student.setStudentId(UUID.randomUUID().toString());
			student.setFirstName(str[0]);
			student.setLastName(str[1]);
			student.setGmail(str[3]);
			student.setGPA(Double.parseDouble(str[3]));
			set.add(student);

		}
		bufferReader.close();
		return set;

	}

}
