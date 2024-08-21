package string;

public class String_Methods {

	public static void main(String[] args) {

		String s1 = "automation";
		
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.charAt(7));
	
		String s2 = "God is Great  ";
		System.out.println(s2.trim());
		
		
		String s3 = "Rashmi";
		System.out.println(s3.substring(2, 6));
		System.out.println(s3.indexOf('i'));
		
		System.out.println(s2.toUpperCase());
		System.out.println(s3.toLowerCase());		
		
		System.out.println(s2.substring(2));
		System.out.println(s2.substring(5, 8));
	}

}
