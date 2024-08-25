package Array;

import java.util.Arrays;

public class Array_Equals {

	public static void main(String[] args) {

		int[] salary = new int[4];
		
				salary[0] = 10;
				salary[1] = 20;
				salary[2] = 30;
				salary[3] = 40;
				
	    int[] salary1 = new int[4];
				
				salary1[0] = 10;
				salary1[1] = 20;
				salary1[2] = 30;
				salary1[3] = 40;	
				
			boolean b1 = Arrays.equals(salary, salary1);
			System.out.println(b1);
			}

}
