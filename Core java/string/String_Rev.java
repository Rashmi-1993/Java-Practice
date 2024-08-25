package string;

public class String_Rev {

	public static void main(String[] args) {

		String s = "Rashmi";
		
		//for (int i=5; i>=0;i--)
		//{
			//System.out.println(s.charAt(i));	
		//}
		
       for (int i=s.length()-1;i>=0;i--)
       {
    	   System.out.println(s.charAt(i));	
       }
		
	}

}
