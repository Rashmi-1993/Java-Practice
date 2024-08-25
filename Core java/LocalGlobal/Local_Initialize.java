package LocalGlobal;

public class Local_Initialize {
	
	static void add()
	{
		 String a = "Hi";
		 System.out.println(a);
		 
	}

	public static void main(String[] args) {
		
		//double salary;  // no default value as it is local var, need to initialize
		double salary = 2000;
		add();

		//System.out.println("a");
		System.out.println(salary);
		//System.out.println("salary");
		
	}

}
