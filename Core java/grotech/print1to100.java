package grotech;

public class print1to100 {

public static void main(String[] args) throws InterruptedException {
		
		for(int i=1;i<=100;i++)
		{
			Thread.sleep(2000);
			System.out.println(i);
		}
	}


}