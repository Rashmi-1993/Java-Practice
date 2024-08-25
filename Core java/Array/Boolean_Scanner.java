package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Boolean_Scanner {

	public static void main(String[] args) {
	
				
				boolean salary[] = new boolean[2];
				Scanner s1 = new Scanner(System.in);
				for(int i=0;i<salary.length;i++)
				{
					salary[i]=s1.nextBoolean();
					
				}
				System.out.println(Arrays.toString(salary));
				
			}

}
