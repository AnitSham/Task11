package task11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilenotFound {

	public static void method() throws FileNotFoundException {

		FileReader FR = new FileReader("D:\\GIT FILES\\Guvi-Training\\Ani.txt");

		BufferedReader BR = new BufferedReader(FR);

		throw new FileNotFoundException();

	}

	public static void main(String[] args) {

		try {
			method();
		} catch (FileNotFoundException e) {
			e.getMessage();
			e.printStackTrace();
			System.err.println("File is not found");
		}
		System.out.println("Rest of the code by default to run ");
	}

}
