package javapackage;

public class Task8Q6 {

	public static void main(String[] args) {
		
	        int num = 4;
	        int i =1; 
	        long factorial = 1;
	        
	        for(i = 1; i <= num; ++i)
	        {
	            
	            factorial *= i;
	        }
	        
	        System.out.printf("Factorial of %d = %d", num, factorial);
		
		}
}