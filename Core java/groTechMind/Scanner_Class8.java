package groTechMind;

import java.util.Scanner;

public class Scanner_Class8 {

	public static void main(String[] args) {

      System.out.println("Enter the values");
      Scanner s1 = new Scanner(System.in);
      int a = s1.nextInt();
      byte b = s1.nextByte();
      int h = s1.nextInt();
      int Area = (a+b)/2*h;
      System.out.println("Area of Tripezium is:" +Area);
      
	}

}