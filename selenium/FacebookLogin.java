package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.name("email")).sendKeys("rashmitrivedi8127@gmail.com");
		
		//driver.findElement(By.id("pass")).sendKeys("rash@123");
		
		//driver.findElement(By.id("loginbutton")).click();
		//driver.findElement(By.name("login")).click();
		
		WebElement e1 = driver.findElement(By.xpath("(//input)[3]"));
		e1.sendKeys("rashmitrivedi8127@gmail.com");
		
		//driver.findElement(By.xpath(//input))
		Thread.sleep(1000);
		
		WebElement e2 = driver.findElement(By.xpath("(//input)[4]"));
		e2.sendKeys("rash@1234");
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//button")).click();
		//driver.findElement(By.name("login")).click();
		
		WebElement e3= driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		e3.click();
		


		
		
		
	}

}
