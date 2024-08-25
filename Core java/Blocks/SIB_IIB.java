package Blocks;

public class SIB_IIB {

	
	static
	{
		System.out.println("SIB");
	}
	SIB_IIB()
	{
		System.out.println("constructor");
	}
	
	{
		System.out.println("IIB");
	}
	public static void main(String[] args) {
		
		System.out.println("main");
		new SIB_IIB();
		new SIB_IIB();
	}
}
