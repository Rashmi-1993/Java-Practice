package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeThroughXpathInGoogle {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement e1 =driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		e1.sendKeys("India");
		Thread.sleep(2000);
		e1.sendKeys(Keys.ARROW_DOWN);
		e1.sendKeys(Keys.ARROW_DOWN);
		e1.sendKeys(Keys.ARROW_DOWN);
		e1.sendKeys(Keys.ARROW_DOWN);
		e1.sendKeys(Keys.ARROW_DOWN);
		e1.sendKeys(Keys.ENTER);
		
		//searchDropdownBox
		//driver.findElement(By.name("btnk")).click();
		//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	}

}
