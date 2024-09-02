package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//WebElement e1 =driver.findElement(By.linkText("Mobiles"));
		//e1.click();
		WebElement e2 =driver.findElement(By.xpath("(//span[.='Mobiles'])[2]"));
		e2.click();
		////span[.='Home & Furniture'][2]
		
	}

}
