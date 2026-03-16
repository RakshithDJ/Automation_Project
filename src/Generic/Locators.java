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
	
		// Launch Chrome browser
		WebDriver driver = new ChromeDriver();

		// Maximize the browser window
		driver.manage().window().maximize();

		// Open the Playwright Locators documentation page
		driver.get("https://playwright.dev/docs/locators");

		// Pause for 2 seconds to allow the page to load
		Thread.sleep(2000);

		// Fetch the text of the first <b> tag on the page
		String s1 = driver.findElement(By.tagName("b")).getText();

		// Display the extracted <b> tag text
		System.out.println(s1);

		// Fetch the text of the element with ID 'locating-elements'
		String s2 = driver.findElement(By.id("locating-elements")).getText();

		// Display the extracted text from the ID element
		System.out.println(s2);

		// Pause for 2 seconds
		Thread.sleep(2000);

		// Click element using CLASS NAME "DocSearch-Search-Icon"
		driver.findElement(By.className("DocSearch-Search-Icon")).click();

		// Pause for 2 seconds
		Thread.sleep(2000);

		// Navigate to the local Demo.html file
		driver.navigate().to("file:///C:/Users/rakshith.s/Desktop/Demo.html");

		// Pause for 2 seconds
		Thread.sleep(2000);

		// Enter text "Ram" into the input field identified by NAME 'username'
		driver.findElement(By.name("username")).sendKeys("Ram");

		// Pause for 2 seconds
		Thread.sleep(2000);

		// Click the link with exact text "Home"
		driver.findElement(By.linkText("Home")).click();

		// Go back to the previous page
		driver.navigate().back();

		// Click the link whose text partially contains "About"
		driver.findElement(By.partialLinkText("About")).click();

		// Pause for 2 seconds
		Thread.sleep(2000);

		// Navigate back to the Demo.html page
		driver.navigate().back();

		// Pause for 2 seconds
		Thread.sleep(2000);

		// Enter an email in the input field located using CSS selector
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("dj@gmail.com");

		// Pause for 2 seconds before submitting the form
		Thread.sleep(2000);

		// Click the Submit button using XPath
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		driver.quit();

	}

}
