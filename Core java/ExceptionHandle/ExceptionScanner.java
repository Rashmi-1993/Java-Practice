package ExceptionHandle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionScanner {

	public static void main(String[] args) {


		System.out.println("Enter your Name");
		Scanner sc = new Scanner(System.in);
		String name  = sc.next();  //need to ask
		
		System.out.println("Enter your Weight");
		Scanner sc1 = new Scanner(System.in);
		try {
		double weight  = sc.nextDouble();
		}
		catch (InputMismatchException i1)
		{
			System.out.println("exception has been handled");
		}
		System.out.println("Enter your Age");
		Scanner sc2 = new Scanner(System.in);
		try {
		int age  = sc.nextInt();
		}catch(InputMismatchException a1)
		{
			System.out.println("handled the exception");
		}

	}

}
