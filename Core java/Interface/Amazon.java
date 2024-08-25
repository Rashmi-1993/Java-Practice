package Interface;

interface Myntra{
	void add();
	void subtract();
}

public class Amazon implements Myntra{

	public static void main(String[] args) {
		Amazon a1 = new Amazon();
		a1.add();
		a1.subtract();

	}

	@Override
	public void add() {
		System.out.println("hello");
	}

	@Override
	public void subtract() {
		System.out.println("Bye");
	}

}
