package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBILogin {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		WebElement e = driver.findElement(By.partialLinkText("CONTINUE"));
		e.click();
		
		//driver.findElement(By.className("login_button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Rashmi Trivedi");
		driver.findElement(By.name("password")).sendKeys("Rash@123");
		driver.findElement(By.id("loginCaptchaValue")).sendKeys("8we5b");
		driver.findElement(By.id("Button2")).click();
		System.out.println(1);

	}

}
