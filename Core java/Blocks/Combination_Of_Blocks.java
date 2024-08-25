package Blocks;

public class Combination_Of_Blocks {

	static
	{
		System.out.println("SIB");
	}
	
	{
		System.out.println("IIB1");
	}
	
	Combination_Of_Blocks()
	{
		System.out.println("constructor");
	}
	
	Combination_Of_Blocks(int a)
	{
		System.out.println("const 1");
	}
	
	{
		System.out.println("IIB3");
	}
	public static void main(String[] args) {
		
		System.out.println("main");
		new Combination_Of_Blocks();
		new Combination_Of_Blocks(1);
		//new Combination_Of_Blocks();
	}

}
