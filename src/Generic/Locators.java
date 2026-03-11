package Generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/***This class defines the Locators
 * There are 8 types of Locators in selenium
 * tagName(String)
 * id(String)
 * className(String)
 * linkText(String)
 * partialLinkText(String)
 * cssSelector(String)
 * Xpath(String)
 * @Author Rakshith
 ***/

public class Locators {

	public static void main(String[] args) throws InterruptedException {
	
		// Launch Chrome browser using ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		// Open the LG India website
		driver.get("https://demoqa.com/");

		// Wait for 2 seconds to let page load
		Thread.sleep(2000);
		
		//driver.findElement(By.tagName("h5")).click();
		
		driver.quit();
		
		

	}

}
