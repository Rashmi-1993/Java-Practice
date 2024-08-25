package ExceptionHandle;

public class Exception1 {

	public static void main(String[] args) {

		try {
		int a=1/0;
		System.out.println(a);
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Handled the exception");
		}
	}

}
