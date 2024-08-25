package Inheritance;

class Flipcart
{
   static void shopping()	
   {
	   System.out.println("shopping done");
   }

   void add_cart()	
   {
	   System.out.println("adding done");
   }
}

class Ajio extends Flipcart
{
   static void purchase()	
   {
	   System.out.println("purchase done");
   }

   void payment()	
   {
	   System.out.println("payment done");
   }
}


public class MultiLevel extends Ajio {

	 void refund()	
	   {
		   System.out.println("return done");
	   }
	
	public static void main(String[] args) {

		MultiLevel m1= new MultiLevel();
		m1.refund();
		m1.add_cart();
		shopping();
		m1.payment();
		
	}

}
