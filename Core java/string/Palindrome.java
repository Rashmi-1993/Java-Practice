package string;

public class Palindrome {

	public static void main(String[] args) {

		String s1 = "radar";
		String r = "";
		for(int i= s1.length()-1;i>=0;i--)
		{
			char ch = s1.charAt(i);
				 r= r+ch;
		}
		
		System.out.println(s1.equals(r));
		
		if(s1.equals(r))
		{
			System.out.println("given string is palindrome");
		}
		else
		{
			System.out.println("given string is not palindrome");
		}
	}

}
