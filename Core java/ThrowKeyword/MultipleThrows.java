package ThrowKeyword;

import java.util.InputMismatchException;

public class MultipleThrows {

	public static void main(String[] args) throws InputMismatchException, InterruptedException  {
		
		Thread.sleep(3000);
		throw new InputMismatchException("not found");
		
		
	}

}
