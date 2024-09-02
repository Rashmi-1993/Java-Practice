package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrotechHtmlPage {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/prabh/Downloads/learningHTML1.html");
		WebElement e1 = driver.findElement(By.xpath("(/html/body/input)[1]"));
		e1.sendKeys("Rashmi1234");
		Thread.sleep(1000);
		WebElement e2 = driver.findElement(By.xpath("(/html/body/input)[2]"));
		e2.sendKeys("sign up");
		WebElement e3 = driver.findElement(By.xpath("(/html/body/input)[3]"));
		e3.sendKeys("rash@1234");
		Thread.sleep(1000);
		WebElement e11 = driver.findElement(By.xpath("a")); //by tagname
		e11.click();
		//WebElement e4 = driver.findElement(By.xpath("(/html/body/form/input)[1]"));
		//e4.sendKeys("Rashmi");
		
		WebElement e4 = driver.findElement(By.xpath("((/html/body/form[1])/input[1])"));
		e4.sendKeys("Rashmi");
		WebElement e5 = driver.findElement(By.xpath("((/html/body/form[1])/input[2])"));
		e5.sendKeys("Trivedi");
		Thread.sleep(1000);
		//WebElement e6 = driver.findElement(By.xpath("((/html/body/form[1])/input[3])"));
		//e6.click();
		WebElement e7 = driver.findElement(By.xpath("((/html/body/form[2])/input[1])"));
		e7.click();
		WebElement e8 = driver.findElement(By.xpath("((/html/body/form[2])/input[2])"));
		e8.click();
		WebElement e9 = driver.findElement(By.xpath("((/html/body/form[2])/input[3])"));
		e9.click();
		WebElement e10 = driver.findElement(By.xpath("(/html/body/select)"));
		e10.click();
	}

}
//(/html/body/input)[1]
//(/html/body/form/input)[1]
//((/html/body/form[1])/input[1])
///html/body/select