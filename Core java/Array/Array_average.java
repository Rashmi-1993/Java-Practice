package Array;

public class Array_average {

	public static void main(String[] args) {


		int r[] = new int[4];
		r[0]=88;
		r[1]=55;
		r[2]=44;
		r[3]=33;
		
		int sum = 0;
		for(int i=0;i<r.length;i++)
		{
			sum=sum+r[i];
		}
		double average = sum/4;

		System.out.println(average);
	}

}
