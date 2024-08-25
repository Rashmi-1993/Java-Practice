package Array;

import java.util.Arrays;

public class Array_Copy {

	public static void main(String[] args) {
		
		
		int[] age = new int[3];
		
		age[0] = 10;
		age[1] = 20;
		age[2] = 30;
		
		
        int[] new_age = new int[3];
        
        for(int i =0; i<age.length;i++)
        {
        	new_age[i] = age[i];
        }
		
        System.out.println(Arrays.toString(age));
		
		System.out.println("new age is");

		System.out.println(Arrays.toString(new_age));
	}

}
