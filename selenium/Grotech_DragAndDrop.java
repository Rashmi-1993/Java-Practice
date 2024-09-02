package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Grotech_DragAndDrop {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");
		
		
		/*WebElement e1 = driver.findElement(By.xpath("//div[@id ='container-6']"));
		
		WebElement e2 = driver.findElement(By.xpath("//div[@id ='div2']"));
        Actions a1 = new Actions(driver);
		a1.dragAndDrop(e1, e2).perform();*/
		
        //revert as it is above problem
		
		WebElement e3 = driver.findElement(By.xpath("//div[@id ='div2']"));
		WebElement e4 = driver.findElement(By.xpath("//div[@id ='container-6']"));
		Actions a2 = new Actions(driver);
		a2.dragAndDrop(e3, e4).perform();
		
		
		
	}

}
