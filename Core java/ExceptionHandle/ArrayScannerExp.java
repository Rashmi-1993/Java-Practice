package ExceptionHandle;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayScannerExp {

	public static void main(String[] args) {

		int a[] = new int[4];
		System.out.println("Enter your Roll no");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			try {
			a[i] = sc.nextInt();	
			}
			catch(InputMismatchException c1)
			{
				
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
