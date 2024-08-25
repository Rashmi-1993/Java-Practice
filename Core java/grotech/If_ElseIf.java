package grotech;

public class If_ElseIf {

	public static void main(String[] args) {

		String g1 = "Male";
		String g2 = "Female";
		int age = 45;
		
		if(g1=="Female"){
			System.out.println("Travelling is free");
		}else{
			if(age > 59) {
				System.out.println("Travelling as Senior Citizen Ticket");
			}else {
				if(age <= 12) {
					System.out.println("Travelling as Half Ticket");
				}else {
					System.out.println("Travelling as Full Ticket");
				}
			}
			
		}
	}

}
