package Keywords;

class Test{
	
	Test()
	{
		System.out.println("food ordered");
	}
}

public class Super_Statement extends Test {
	
	Super_Statement()
	{
		super();
		System.out.println("item ordered");
	}

	public static void main(String[] args) {


		Super_Statement s = new Super_Statement();
				
	}

}
