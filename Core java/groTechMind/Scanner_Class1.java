package groTechMind;

import java.util.Scanner;

public class Scanner_Class1 {

	public static void main(String[] args) {

		Scanner s =  new Scanner(System.in);
		
		System.out.println("Please enter the number");
		
		byte b = s.nextByte();
		int a = s.nextInt();
		long c = s.nextLong(); 
		long sum=a+b+c;
		
		System.out.println("addition is: " +sum);

	}

}

