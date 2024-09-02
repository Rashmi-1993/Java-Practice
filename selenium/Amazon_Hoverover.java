package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Hoverover {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	
		WebElement e1 = driver.findElement(By.xpath("//span[@class='nav-line-2']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();
		
		//WebElement signin = driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
		//signin.click();
		
		//WebElement signin1 = driver.findElement(By.className("nav-action-inner"));
		//signin1.click();

		WebElement signin2 = driver.findElement(By.xpath("//span[.='Sign in']"));
		signin2.click();

	}

}
