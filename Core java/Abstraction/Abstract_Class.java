package Abstraction;


abstract class Flipcart{
	
	abstract void add();
	abstract void sub();
}

public class Abstract_Class extends Flipcart{
	
	//@Override
	void add() {
		System.out.println(3);
	}

	//@Override
	void sub() {
		System.out.println(4);
	}

	
	static void mul() 
	{
		System.out.println(1);
	}
	static void div() 
	{
		System.out.println(2);
	}

	public static void main(String[] args) {
		
		mul();
		div();
		Abstract_Class a1 = new Abstract_Class();
		a1.add();
		a1.sub();

	}

}
