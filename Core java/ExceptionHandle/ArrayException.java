package ExceptionHandle;

import java.util.Arrays;

public class ArrayException {

	public static void main(String[] args) {
		
		int a[] = new int[4];
		a[0] = 21;
		a[1] = 24;
		a[2] = 26;
		a[3] = 33;
		try {
		a[4] = 78;
		}
		catch(ArrayIndexOutOfBoundsException a1)
		{
			System.out.println("success");
		}
		
		System.out.println(Arrays.toString(a));
		
	}

}
