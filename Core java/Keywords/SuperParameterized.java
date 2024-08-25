package Keywords;

class Amazon{
	
	Amazon(int i)
	{
		System.out.println("Hi");
	}
}

public class SuperParameterized extends Amazon{
	
	SuperParameterized()
	{
		super(90);
		System.out.println("Hello");
	}

	public static void main(String[] args) {

		SuperParameterized sp = new SuperParameterized();
		
		
	}

}
