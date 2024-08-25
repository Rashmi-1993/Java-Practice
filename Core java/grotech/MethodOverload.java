package grotech;

public class MethodOverload {
	
	void login(int i)
	{
		System.out.println("Login Successfully");
	}
	
	void login(int i, String r)
	{
		System.out.println("I am employee in corporate");
	}
	
	static void login(int i, double d)
	{
		System.out.println("Login Failed");
	}

	public static void main(String[] args) {
		
		MethodOverload m1 = new MethodOverload();	
		m1.login(1);
		m1.login(2,"hello");
		login(2,3.14);
	}
	
}
