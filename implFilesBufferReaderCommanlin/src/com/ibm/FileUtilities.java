package com.ibm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileUtilities {

	public static void main(String[] args) throws IOException {
		File inputFile = new File(args[0]);
		File outputFile = new File(args[1]);

		FileReader in = new FileReader(inputFile);
		FileWriter out = new FileWriter(outputFile);

		BufferedReader inputStream = new BufferedReader(in);
		PrintWriter outputStream = new PrintWriter(out);

		String l;
		while ((l = inputStream.readLine()) != null) {
			System.out.println(l);
			outputStream.println(l);
			// outputStream.write(l);
		}

		in.close();
		out.close();
	}

}
