package Interface;

interface Grand_Parent{

	void method1();
	void method2();

}

class Parent implements Grand_Parent{
	
	static void method3()
	{
        System.out.println(3);
	}
	 void method4()
	{
		System.out.println(4);
	}
	 
	@Override
	public void method1() {
		System.out.println(1);
	}
	@Override
	public void method2() {
		System.out.println(2);		
	}
}

public class Interface_Class extends Parent{
	
	static void method5()
	{
        System.out.println(5);
	}
	 void method6()
	{
		System.out.println(6);
	}
	

	public static void main(String[] args) {
		
		method5();
		method3();
		Interface_Class i1 = new Interface_Class();
		i1.method4();
		i1.method2();
		i1.method1();
		i1.method6();
	}

}
