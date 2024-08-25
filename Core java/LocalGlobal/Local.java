package LocalGlobal;

public class Local {
	
		int a=10;
		static int b=20;
		
		void man()
		{
			final double pi=3.14;
			
			System.out.println(pi);
		}
	

	public static void main(String[] args) {

		
		int z;
		System.out.println(b);
		Local l1=new Local();
		System.out.println(l1.a);
		l1.man();
		
	}

}
