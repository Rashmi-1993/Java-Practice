package Array;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {

		int r[] = new int[4];
		r[0]=88;
		r[1]=55;
		r[2]=44;
		r[3]=33;
		System.out.println(r[1]);
		System.out.println(r[0]);
		
		/*for (int i=0;i<=2;i++)
		{
			System.out.println(r[i]);
		}*/
		
		System.out.println(Arrays.toString(r));
	}

}
