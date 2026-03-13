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

		// Maximize browser window
		driver.manage().window().maximize();

		// Open the LG India website (Playwright Locators page actually)
		driver.get("https://playwright.dev/docs/locators");

		// Wait for 2 seconds to let page load
		Thread.sleep(2000);

		// Locate the FIRST <b> tag on the webpage and get its text
		String s1 = driver.findElement(By.tagName("b")).getText();

		// Print the text of the <b> tag
		System.out.println(s1);

		// Locate element by its ID 'locating-elements' and get its text
		String s2 = driver.findElement(By.id("locating-elements")).getText();

		// Print the text obtained from the ID element
		System.out.println(s2);

		// Wait for 2 seconds
		Thread.sleep(2000);

		// Locate element using CLASS NAME "DocSearch-Button-Container"
		// and type "Sel" into it (Note: this element may not accept typing)
		//driver.findElement(By.className("DocSearch-Button-Placeholder")).sendKeys("Sel");

		// Wait for 2 seconds
		Thread.sleep(2000);

		// Navigate to local HTML file Demo.html
		driver.navigate().to("file:///C:/Users/rakshith.s/Desktop/Demo.html");

		// Wait for 2 seconds
		Thread.sleep(2000);

		// Locate input element using NAME locator and type "Ram"
		driver.findElement(By.name("username")).sendKeys("Ram");

		// Wait for 2 seconds
		Thread.sleep(2000);

		// Click the link whose visible text is exactly "Home"
		driver.findElement(By.linkText("Home")).click();

		// Navigate back to previous page
		driver.navigate().back();

		// Click link containing partial text "About"
		driver.findElement(By.partialLinkText("About")).click();

		// Wait for 2 seconds
		Thread.sleep(2000);

		// Navigate back again
		driver.navigate().back();

		// Wait for 2 seconds
		Thread.sleep(2000);

		// Locate input field using CSS selector (placeholder attribute)
		// and type an email address into it
		//driver.findElement(By.cssSelector("input[placeholder=Enter Email]")).sendKeys("dj@gmail.com");
		
		driver.quit();

	}

}
