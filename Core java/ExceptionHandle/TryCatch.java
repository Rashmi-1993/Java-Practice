package ExceptionHandle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {

		System.out.println("Enter your Starting Name");
		Scanner s1 = new Scanner(System.in);
		String s = s1.next();
		
		System.out.println("Enter your born year");
		Scanner s2 = new Scanner(System.in);
		try {
		int year = s2.nextInt();
		} 
		catch(InputMismatchException a1)
		{
			System.out.println("wrong Input, please read carefully");
			System.out.println("Enter your born year");
			//Scanner s1 = new Scanner(System.in);
			int year = s2.nextInt();
			
		}

	}

}
