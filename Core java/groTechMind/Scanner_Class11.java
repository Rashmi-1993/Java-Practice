package groTechMind;

import java.util.Scanner;

public class Scanner_Class11 {

	public static void main(String[] args) {
		
		System.out.println("Enter the values");
	      Scanner s1 = new Scanner(System.in);
	      
	      long a = s1.nextLong();
	      long b = s1.nextLong();
	      double d = s1.nextDouble();
	      long c = s1.nextLong();
	      
	     double circumference = a+b+c+d;
	     
	    System.out.println("circumference of Trapezoid is :"  +circumference);
	    	

	}

}