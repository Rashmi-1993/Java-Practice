package Array;

import java.util.Arrays;
import java.util.Scanner;

public class String_Scanner {
	
	public static void main(String[] args) {
		
		
		String salary[] = new String[2];
		Scanner s1 = new Scanner(System.in);
		for(int i=0;i<salary.length;i++)
		{
			salary[i]=s1.next();
			
		}
		System.out.println(Arrays.toString(salary));

	}
	

}
