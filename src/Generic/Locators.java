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
		driver.get("https://playwright.dev/docs/locators");

		// Wait for 2 seconds to let page load
		Thread.sleep(2000);
		
	    String s1 =driver.findElement(By.tagName("b")).getText();
		
	    System.out.println(s1);
	    
	    String s2= driver.findElement(By.id("locating-elements")).getText();
	    System.out.println(s2);
		
	    driver.quit();
		
		

	}

}
