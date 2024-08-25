package Hirarichal;

public class Testcase1 extends Precondition{

	
	void login()
	{
		System.out.println("login successful");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Testcase1 t1 = new Testcase1();
		t1.chromelaunch();
		t1.login();
	}

}
