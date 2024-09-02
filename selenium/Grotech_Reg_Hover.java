package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Grotech_Reg_Hover {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/automate-me/");
		
		//WebElement e1 = driver.findElement(By.xpath("//h3[@class='elementor-flip-box__layer__overlay']"));
		WebElement e1 = driver.findElement(By.xpath("//h3[.=' 								Registration ']"));
		
		
        Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();
	}

}
