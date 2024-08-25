package Keywords;

public class ThisKeyword {

	
	int rollno;
	double weight;
	int age;
	
	void data(int rollno, double weight, int age) {
		//System.out.println("hi");
		this.rollno = rollno;
		this.weight = weight;
		this.age = age;
	}
	public static void main(String[] args) {

		ThisKeyword t1 = new ThisKeyword();
		t1.data(4, 54.7, 56);
		System.out.println(t1.rollno);
		System.out.println(t1.weight);
		System.out.println(t1.age);
	}

}
