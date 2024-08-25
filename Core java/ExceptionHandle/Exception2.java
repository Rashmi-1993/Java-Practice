package ExceptionHandle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {
		
		System.out.println("Enter your Roll no");
		Scanner s2 = new Scanner(System.in);
		try {
		int roll_no = s2.nextInt();
		}
		catch(InputMismatchException a1)
		{
			System.out.println("wrong Input, please read carefully");
			System.out.println("Enter your Roll no");
			Scanner s3 = new Scanner(System.in);
			int roll_no = s3.nextInt();
			}
		System.out.println("Enter your Starting Name");
		Scanner s1 = new Scanner(System.in);
		String s = s1.next();
		
			
		}

	}


