package Array;

public class Array_Exist {

	public static void main(String[] args) {


		int[] salary = new int[4];
		
		salary[0] = 100;
		salary[1] = 200;
		salary[2] = 300;
		salary[3] = 400;
		
		int givennumber = 300;
		for(int i=0;i<salary.length;i++)
		{
			if(givennumber == salary[i])
			{
				System.out.println("part of array");
			}
			else
			{
				System.out.println("Not Exist");
			}
		}
		
		
	}

}
