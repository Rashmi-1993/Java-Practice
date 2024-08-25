package groTechMind;

import java.util.Scanner;

public class Scanner_Class7 {

	public static void main(String[] args) {

      System.out.println("Enter the values");
      Scanner s1 = new Scanner(System.in);
      int b = s1.nextInt();
      byte h = s1.nextByte();
      int Area = b*h;
      System.out.println("Area of rectengle is:" +Area);
      
	}

}
