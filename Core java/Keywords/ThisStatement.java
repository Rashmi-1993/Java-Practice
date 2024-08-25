package Keywords;



public class ThisStatement {
	
	ThisStatement()
	
	{
		System.out.println("test");
	}

    ThisStatement(int i)
	
	{
    	this();
		System.out.println("data");
	}
    
    
    ThisStatement(int i, double e)
	
	{
    	this(100);   //need to ask
		System.out.println("data2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ThisStatement();
		//new ThisStatement(100);
	}

}
