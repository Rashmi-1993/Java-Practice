package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		driver.findElement(By.id("ap_email_login")).sendKeys("rashmitrivedi8127@gmail.com");
		
		//driver.findElement(By.name("email")).sendKeys("rashmi@gmail.com");

		//WebElement a1 = driver.findElement(By.id("ap_email_login"));
		//a1.sendKeys("rashmitrivedi8127@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys("897987");
		driver.findElement(By.id("signInSubmit")).click();
		
		
		
	}

}
