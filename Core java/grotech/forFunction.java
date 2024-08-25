package grotech;

public class forFunction {

	
	public static void main(String[] args) {
		System.out.println("Print 1 to 10 counting...");
		print0to10();
		System.out.println();
		System.out.println("Print 1 to 100 counting...");
		print0to100();
		System.out.println();
		System.out.println("Print -10 to 10 counting...");
		printN10to10();
		System.out.println();
		System.out.println("Print 10 to -10 counting...");
		print10toN10();
		System.out.println();
		System.out.println("Print 51 to infinite counting...");
		print51toInf();
	}
	
	static void print0to10() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
	
	static void print0to100() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}
	
	static void printN10to10() {
		for (int i = -10; i <= 10; i++) {
			System.out.println(i);
		}
	}
	
	static void print10toN10() {
		for (int i = 10; i >= -10; i--) {
			System.out.println(i);
		}
	}
	
	static void print51toInf() {
		for (int i = 51; i > 50; i++) {
			System.out.println(i);
//			if(i==100)
//				break;
		}
	}
}
