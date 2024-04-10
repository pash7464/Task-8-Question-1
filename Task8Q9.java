package javapackage;

import java.util.Scanner;

public class Task8Q9 {

	public static void main(String[] args) {
		
		Scanner myagewt = new Scanner(System.in);
		
		System.out.println("Enter The age:");
		int a = myagewt.nextInt();
		
		if (a > 65) {
			System.out.println("Person is Senior Citizen: ");
		}
		else {
			System.out.println("Person is not Senior Citizen: ");
		}
		
	}

}
