package SwitchCase;

public class Switch1 {

	public static void main(String[] args) {

		String fruit = "apple";  
		String fruitColor;  
		  switch (fruit) {  
		     case "banana":  
		        fruitColor = "yellow";  
		        break;  
		     case "apple":  
		        fruitColor = "red";  
		        break;  
		     case "orange":  
		        fruitColor = "orange";  
		        break;  
		     default:  
		         fruitColor = "unknown";  
		         break;  
		   }  
		   System.out.println("Fruit: " + fruit);  
		   System.out.println("Fruit color: " + fruitColor); 
	}

}
