package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_AddtoCart {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement e1 = driver.findElement(By.xpath("(//input)[5]"));
		e1.sendKeys("shirt for men" + Keys.ENTER);
		WebElement e2 = driver.findElement(By.xpath("//span[@class='nav-cart-count nav-cart-1 nav-progressive-attribute nav-progressive-content']"));
		e2.sendKeys("shirt for men" + Keys.ENTER);   //need to confirm

	}

}
//span[@class='nav-cart-count nav-cart-1 nav-progressive-attribute nav-progressive-content']