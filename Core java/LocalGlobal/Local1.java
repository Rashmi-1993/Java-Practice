package LocalGlobal;

public class Local1 {
	
	//static int b = 67;

	public static void main(String[] args) {

		int age = 30;
		int a=2;
		age = 35;
		int value= age+a;
		int value1= age*a;
		//int updated_value = a+b;
		System.out.println("present data is>" +value);
		System.out.println("present data is>" +value1);
		//System.out.println("present data is>" +updated_value);
	}

}

