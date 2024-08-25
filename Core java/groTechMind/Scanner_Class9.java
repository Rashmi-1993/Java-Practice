package groTechMind;

import java.util.Scanner;

public class Scanner_Class9 {
	
	static double pi = 3.14;

	public static void main(String[] args) {

      System.out.println("Enter the values");
      Scanner s1 = new Scanner(System.in);
      
      double radius = s1.nextInt();
      double circumference = 2*pi*radius;
      System.out.println("circumference of circle is:" +circumference);
      
	}

}