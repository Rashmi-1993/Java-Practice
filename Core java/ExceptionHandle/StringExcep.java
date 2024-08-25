package ExceptionHandle;

import java.util.Arrays;
import java.util.Scanner;

public class StringExcep {

	public static void main(String[] args) {
				
			String salary[] = new String[2];
			System.out.println("Enter the string");
			Scanner s1 = new Scanner(System.in);
			for(int i=0;i<salary.length;i++)
			{
				salary[i]=s1.next();
				
			}
			System.out.println(Arrays.toString(salary));

	}

}
