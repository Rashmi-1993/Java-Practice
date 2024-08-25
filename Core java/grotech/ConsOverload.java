package grotech;

public class ConsOverload {

	ConsOverload()
	{
		System.out.println("This is Constructor");
	}

	ConsOverload(String s)
	{
		System.out.println("This is Constructor 2");
	}

	ConsOverload(int a)
	{
		System.out.println("This is Constructor 3");
	}
	public static void main(String[] args) {
		
		ConsOverload c1 = new ConsOverload();
		new ConsOverload();
		new ConsOverload("Hi");
		ConsOverload c2 = new ConsOverload();
		new ConsOverload("Bye");
		new ConsOverload(10);
	
	}
}


//c2.ConsOverload("Bye");
//c3.ConsOverload(10);
