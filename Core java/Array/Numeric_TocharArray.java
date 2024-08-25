package Array;

import java.util.Arrays;

public class Numeric_TocharArray {

	public static void main(String[] args) {

		String s1 = "w-151, sector -12, Noida";
		char[] c= s1.toCharArray();
		System.out.println(c);
		System.out.println(Arrays.toString(c));
		for(int i=0;i<s1.length();i++)
		{
			boolean result = Character.isDigit(c[i]);
			System.out.println(result);
		}
		System.out.println("count spaces");
		for(int i=0;i<s1.length();i++)
		{
			boolean result1 = Character.isSpaceChar(c[i]);
		    System.out.println(result1);
		}
		
		//System.out.println(Character.isDigit(c[4]));
		//System.out.println(Character.isAlphabetic(c[20]));
		
	}

}
