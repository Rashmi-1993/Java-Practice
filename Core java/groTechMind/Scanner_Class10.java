package groTechMind;

import java.util.Scanner;

public class Scanner_Class10 {

	public static void main(String[] args) {
		
		System.out.println("Enter the values");
	      Scanner s1 = new Scanner(System.in);
	      
	      long a = s1.nextLong();
	      long b = s1.nextLong();
	      long c = s1.nextLong();
	      
	     long circumference = a+b+c;
	     
	    System.out.println("circumference of Traingle is :"  +circumference);
	    	

	}

}
