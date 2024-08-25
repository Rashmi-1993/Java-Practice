package LocalGlobal;

public class Local2 {
	
	void eat()
	{
		System.out.println("Apple is healty to eat");
	}
	
	static void walk()
	{
		System.out.println("walking is good for health");
	}

	public static void main(String[] args) {
		
		Local2 l2 = new Local2();
		l2.eat();
		walk();
		
	}

}
