package groTechMind;

import java.util.Scanner;

public class Scanner_Class3 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
	
		System.out.println("Enter the two numbers");
	    long a = s1.nextLong();
	    byte b = s1.nextByte();
	    
	    long sum = a+b;
	    long sub = a-b;
	    long div = a/b;
	    long mod = a%b;
	    long mul = a*b;
	    
	    System.out.println("sum of two numbers are=>" +sum);
	    System.out.println("sub of two numbers are=>" +sub);
	    System.out.println("div of two numbers are=>" +div);
	    System.out.println("mod of two numbers are=>" +mod);
	    System.out.println("mul of two numbers are=>" +mul);
	    
	}

}
