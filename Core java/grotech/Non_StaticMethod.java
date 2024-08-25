package grotech;

public class Non_StaticMethod {
	
	void student()
	{
		String s="i am student of mkt";
		System.out.println(s);
	}
	void details()
	{
		String name = "Narendra Modi is a PM of India";
		System.out.println(name);
	}
	void calculation()
	{
		int a=20;
		int b=30;
		int reminder=b%a;
	    System.out.println(reminder);
	}

	public static void main(String[] args) {
		Non_StaticMethod n1 = new Non_StaticMethod();
		n1.student();
		n1.calculation();
		n1.details();
	}
}
