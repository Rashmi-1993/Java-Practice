package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_AutoSugg_Keys {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	
		/*WebElement e1 = driver.findElement(By.id("searchDropdownBox"));
		e1.sendKeys("Amazon Devices");
		e1.sendKeys(Keys.ARROW_DOWN);
		//e1.sendKeys(Keys.ARROW_DOWN);
		e1.sendKeys(Keys.ENTER);*/
		
		WebElement e2 = driver.findElement(By.id("searchDropdownBox"));
		Select s1 = new Select(e2);
		//s1.selectByVisibleText("Books");
		//e2.sendKeys(Keys.ENTER);
		//s1.selectByValue("search-alias=stripbooks");
		s1.selectByIndex(12);
	}
	

}
