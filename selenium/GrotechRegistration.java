package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrotechRegistration {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.findElement(By.name("firstName")).sendKeys("Rashmi");
		driver.findElement(By.name("lastName")).sendKeys("Trivedi");
		driver.findElement(By.name("email")).sendKeys("rashmitrivedi8127@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("8438438990");
		driver.findElement(By.id("aadhaar")).sendKeys("34980438438990");
		driver.findElement(By.id("pan")).sendKeys("8fgfbs8990");
		WebElement e1 =driver.findElement(By.id("terms"));
		if(e1.isSelected())
		{
			System.out.println("checkbox is selected");
		
		}
		else
		{
			
			System.out.println("checkbox is not selected, so let's select it");
			e1.click();
		}
		driver.findElement(By.name("Submit")).click();

	}

}
