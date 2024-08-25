package string;

public class StringFunctions {

	public static void main(String[] args) {

		String s1 = "Nitya";
		String s4= "nitya";
		String s2 = "eat to stay healthy";
		System.out.println(s1.charAt(2));
		
		
		System.out.println(s1.toUpperCase());
		String s3 = "       eat to stay healthy     ";
		
		System.out.println(s2.trim());
		System.out.println(s3.trim());
		System.out.println(s1.substring(1));
		System.out.println(s2.substring(2, 8));
		
		//System.out.println(s2.indexOf(s2));  need to ask
		
		System.out.println(s2.indexOf('t'));
		System.out.println(s2.indexOf('h'));
		System.out.println(s1.concat(s3));
		System.out.println(s1.length());
		System.out.println(s1.equals(s1));
		System.out.println(s1.equalsIgnoreCase(s4));
	}

}
