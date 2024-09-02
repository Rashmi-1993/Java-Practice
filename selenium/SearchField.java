package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchField {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("movies");
		//driver.findElement(By.name("btnk")).click();
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		
	
	}
	
}

