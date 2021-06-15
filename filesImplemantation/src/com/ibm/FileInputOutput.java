package com.ibm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutput {

	public static void main(String[] args) throws IOException {
		File inputFile = new File("InputFile.txt");
		File outputFile = new File("OutputFile.txt");
		FileInputStream inputStream = null;
		FileOutputStream outputStream = null;
		try {
			inputStream = new FileInputStream(inputFile);
			outputStream = new FileOutputStream(outputFile);
			int c;
			try {
				while ((c = inputStream.read()) != -1) {
					System.out.println(c);
					outputStream.write(c);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} finally {
			inputStream.close();
			outputStream.close();
		}

	}
}
