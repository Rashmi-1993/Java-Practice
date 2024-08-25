package grotech;

public class StaticMethod {
	
	static void instituteName()
	{
		System.out.println("My institute is Grotech Minds");
	}
    static void data()
	{
    	String name = "Rashmi Mishra";
		System.out.println(name);
	}
    static void month()
   	{
       	int a=7;
       	int b=4;
       	int mul=a*b;
   		System.out.println(mul);
   	}
	public static void main(String[] args) {	
		instituteName();
		data();
		month();
		
	}

}
