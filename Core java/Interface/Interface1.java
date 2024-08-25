
package Interface;

interface Super_Class{

	void method1();
	void method2();

}

abstract class Parent1 implements Super_Class{ 
	// as we are adding unimplemented methods implementation(overridden methods) of the super most class 
	//directly in the child class, thats why child class needs to be abstract
	
	static void method3()
	{
        System.out.println(3);
	}
	 void method4()
	{
		System.out.println(4);
	}
	 
	
}

public class Interface1 extends Parent1{
	
	static void method5()
	{
        System.out.println(5);
	}
	 void method6()
	{
		System.out.println(6);
	}
	 
	 @Override
		public void method1() {
			System.out.println(1);
		}
		@Override
		public void method2() {
			System.out.println(2);		
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

