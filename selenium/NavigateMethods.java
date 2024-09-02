package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();  //empty browser
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();  //going backward (forward will enable on browser)
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
	}

}
