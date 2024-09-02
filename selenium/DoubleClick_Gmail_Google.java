package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_Gmail_Google {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement e1 = driver.findElement(By.xpath("//a[.='Gmail']"));
		Actions a1 = new Actions(driver);
		a1.doubleClick(e1).perform();
		
	}

}
