package Array;

public class Count_Alphabet {
	

	static int a=0;
	public static void main(String[] args) {
		String s1 = "nitya - @1234";
		char[] ch = s1.toCharArray();
		for (int i=0;i<s1.length();i++)
		{
			boolean result = Character.isAlphabetic(ch[i]);
			System.out.println(result);
		}
		
		if(result==true)// need to ask
		{
			a++;
		}

	}

}
