package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Grotech_Registration_DropDown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement e1 =driver.findElement(By.name("Skills"));
		Select s1 = new Select(e1);
		//s1.selectByValue("select2");
		s1.selectByVisibleText("Technical Skills");
		
		//WebElement e2 =driver.findElement(By.className("Country ss form-control"));
		WebElement e2 =driver.findElement(By.id("Country"));
		Select s2 = new Select(e2);
		//s2.selectByIndex(3);
		s2.selectByValue("Combodia");
		
		
		WebElement e3 =driver.findElement(By.name("Relegion"));
		Select s3 = new Select(e3);
		s3.selectByVisibleText("Parsis");
		
		

	}

}


