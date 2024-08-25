package groTechMind;

import java.util.Scanner;

public class Scanner_Class5 {
	
	final static double pi = 3.14;

	public static void main(String[] args) {
		
		System.out.println("enter the values");
		
		
		Scanner s = new Scanner(System.in);
		double r = s.nextDouble();
		
		//int r = s.nextInt();
		double area = pi*r*r;
		System.out.println("Area of circle is:" +area);
		
		
	}

}
