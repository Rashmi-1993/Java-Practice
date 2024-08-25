package grotech;

public class LocalVar {
	
	static int temp = 10;
	int go = 20;
	static void myAge()
	{
		int age=30;
		age=30+2;
		System.out.println(age);
	}
	
	void name()
	{
		String r="Rashmi";
		System.out.println(r);
	}
	
	public static void main(String[] args) {
		//myAge();
		LocalVar l1 = new LocalVar();
		l1.name();
		int t = l1.go;
		int t2 = temp;
		System.out.println(t+" "+t2);
		//System.out.println(t+" "+t2);
	}

	
}


