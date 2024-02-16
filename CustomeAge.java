package task11;

import java.io.IOException;

public class CustomeAge {

	 public static void validate(int age) throws IOException {
		 
		if (age<18) {
			 throw new IOException("Age is not valid to vote");   
		 }
		 else {
			 System.out.println("Person is eligible to vote!");
		 }
	 }
		public static void main(String[] args){
			
		try {
			validate(13);
		} catch (IOException e) {
			System.err.println("Invalid Age Exception");
		}
	
		}
	 }
