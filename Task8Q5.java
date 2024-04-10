package javapackage;

public class Task8Q5 {

	public static void main(String[] args) {
		 
		int num = 31;
		    boolean result = false;
		    for (int i = 2; i <= num / 2; ++i) {
		      // condition for nonprime number
		      if (num % i == 0) {
		        result = true;
		        break;
		      }
		    }

		    if (!result)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
		  }
	
	}