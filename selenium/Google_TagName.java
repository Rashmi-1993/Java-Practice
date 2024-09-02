package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_TagName {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement e1 =driver.findElement(By.tagName("textarea"));

		e1.sendKeys("India");
		e1.sendKeys(Keys.ENTER);
	}

}
