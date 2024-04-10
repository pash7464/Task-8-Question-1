package javapackage;

import java.util.Scanner;
public class Task8Q10 {

	public static void main(String[] args) {
		 
		int count = 0, num = 987536;

		    while (num != 0) {
		     
		      num /= 10;
		      ++count;
		    }
		    System.out.println("Number of digits: " + count);
	}

}
