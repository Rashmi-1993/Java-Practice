package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.close();
		driver.getWindowHandle();
		driver.getWindowHandles();
		//driver.findElement(null);
		String title = driver.getTitle();
		System.out.println(title);

	}

}
