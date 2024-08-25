package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Double_Scanner {

	public static void main(String[] args) {
		
		double salary[] = new double[4];
		Scanner s1 = new Scanner(System.in);
		for(int i=0;i<salary.length;i++)
		{
			salary[i]=s1.nextDouble();
			
		}
		System.out.println(Arrays.toString(salary));
		
	}

}

