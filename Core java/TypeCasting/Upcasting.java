package TypeCasting;

class Parent{
	

	static void test() 
	{
		System.out.println("Hi");
	}
  
     void test1() 
	{
		System.out.println("Hello");
	}
	
	
}

public class Upcasting extends Parent{
	
	static void animal() 
	{
		System.out.println("Elephant");
	}
	 void birds() 
	{
		System.out.println("Parret");
	}

	public static void main(String[] args) {
		
		 Parent p1 = new Upcasting();
		 //Parent p2 = (Parent) new Upcasting();  //explicit upcast
		 
		 p1.test();
		 p1.test1();
		 
		// Upcasting u1 = Parent p1;
		Upcasting u1 = (Upcasting)p1;
		 u1.birds();
		 u1.animal();

	}

}
