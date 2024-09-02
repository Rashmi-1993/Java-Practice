package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAmazon {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shirt for men"  + Keys.ENTER);
		
		//WebElement e = driver.findElement(By.linkText("Best Sellers"));
		//e.click();
		
		//WebElement e = driver.findElement(By.partialLinkText("Sellers"));
		//e.click();
		
		
		
		
		
		
		

	}

}
