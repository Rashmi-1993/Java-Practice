package Array;

public class StringRever1 {

	public static void main(String[] args) {
		
		String s1= "nitya";
		String result = "";
		
		for(int i=4;i>=0;i--)
		{

			//System.out.println(s1.charAt(i));
			char ch = s1.charAt(i);
			result = result+ch;
		}
	    
		System.out.println(result);
	}

}
