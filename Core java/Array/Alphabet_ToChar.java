package Array;

import java.util.Arrays;

public class Alphabet_ToChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

				String s1 = "K-524, world bank barra, kanpur";
				char[] ch = s1.toCharArray();
				 
				System.out.println(Arrays.toString(ch));
				
				//boolean b = Character.isAlphabetic(ch[7]);
				
				for(int i=0;i<s1.length();i++)
				{
					boolean result = Character.isAlphabetic(ch[i]);
					boolean result1 = Character.isSpaceChar(ch[i]);
					System.out.println(result);
					System.out.println(result1);
				}
	
	}
	
	
}
