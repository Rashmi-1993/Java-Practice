package Hirarichal;

class Parent{
	
	void add()
	
	{
		System.out.println("addition");
	}
}

public class MethodOverridding extends Parent{
	

	void add()
	
	{
		
		System.out.println("subtraction");

		super.add();
	}
	

	public static void main(String[] args) {
	    
		MethodOverridding m = new MethodOverridding();
		m.add();
	}

}
