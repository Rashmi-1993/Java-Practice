package Inheritance;

class Hi{
	
	static void login()
	{
		System.out.println("enter with mobile");
	}
	
	void calling()
	{
		System.out.println("calling successful");
	}
}

public class Single_Inheritance extends Hi{

	static void registration()
	{
		System.out.println("registration done");
	}
	
	public static void main(String[] args) {

		registration();
		login();
		Single_Inheritance s1= new Single_Inheritance();
		s1.calling();
		
	}
	

}
