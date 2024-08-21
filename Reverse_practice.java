package string;

import java.util.Arrays;

public class Reverse_practice {

	public static void main(String[] args) {

		String a = "Kamna";
		String result = "";
		 
		for(int i=a.length()-1;i>=0;i--)
		{
			char ch = a.charAt(i);
			result = result+ch;
		}
	    System.out.println(result);	
	}
	

}
