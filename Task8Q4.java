package javapackage;

import java.util.Scanner;
public class Task8Q4 {

	public static void main(String[] args) {
		
	Scanner mySc = new Scanner(System.in);

	System.out.println("Enter the First Number: ");//Getting the input form user.
	int a= mySc.nextInt();//Reading the entered input from user.
	
	System.out.println("Enter the Second Number: ");//Getting the input form user.
	int b= mySc.nextInt();//Reading the entered input from user.
	
	System.out.println("Before Swapping:");
	System.out.println("First Number is :" + a);
	System.out.println("Second Number is :" + b);
	
	int temp =a;
	a =b;
	b =temp;
	
	System.out.println("After Swapping:");
	System.out.println("First Number is :" + a);
	System.out.println("Second Number is :" + b);
	
	}
}
