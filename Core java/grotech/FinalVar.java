package grotech;

public class FinalVar {

	final static int myAge = 27;
	
	static void hello()
	{
		final int a=7;
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		final int myNum = 15;
		//myNum = 25;

		System.out.println(myNum);
		System.out.println(myAge);
		
		

	}
	
	

}
