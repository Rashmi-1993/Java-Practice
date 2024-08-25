package Abstraction;

abstract class Grand_Parent{
	abstract void sub();
	abstract void div();
	static void add() {
		int a = 6;
		int b = 3;
		System.out.println(a+b);
	}
}

class Parent extends Grand_Parent{
	
	void mul() {
		int a = 6;
		int b = 3;
		System.out.println(a*b);
	}

	@Override
	void sub() {
		System.out.println("Proceed");
	}

	@Override
	void div() {
		System.out.println("successful");
		
	}
}


public class Abs_Class extends Parent{

	public static void main(String[] args) {

		add();
		//Parent p1 = new Parent();
		//p1.mul();
		//p1.div();
		//p1.sub();

		Abs_Class p1 = new Abs_Class();
		p1.mul();
		p1.div();
		p1.sub();


	}

}
