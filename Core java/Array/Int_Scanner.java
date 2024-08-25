package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Int_Scanner {

	public static void main(String[] args) {

		int salary[] = new int[3];
		
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<salary.length;i++)
		{
			salary[i]=sc.nextInt();
			//System.out.println(Arrays.toString(salary));  //need to ask
		}
		System.out.println(Arrays.toString(salary));
	}

}
