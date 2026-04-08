package PractiseScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/***
 * This TestScript is of Handling dropdown 
 * Dropdown is an element which contians set of options 
 * In dropdown there are two types 
 * Single Select 
 * Multi Select
 * Generally dropdown will be created using select tag or div tag
 * If it is created using div it can handles using findelement()
 * If dropdown is created using option tag ,select tag then we use non static methods of select class to handle it 
 * In order to access non static methods we need to create object of Select class
 * Select class constructor will take webelement as parameter where need to pass the address of dropdown created using select tag.
 * 
 */


public class TestScript13 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		// Launches a new Chrome browser instance

		driver.manage().window().maximize();
		// Maximizes the browser window

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Sets an implicit wait of 5 seconds for all element searches

		driver.get("https://demoapps.qspiders.com/");
		// Navigates to the QSpiders demo applications website

		Thread.sleep(2000);
		// Pauses execution for 2 seconds to allow page loading

		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		// Clicks on the "UI Testing Concepts" section using XPath

		Thread.sleep(2000);
		// Waits for the UI Testing Concepts page to load

		driver.findElement(By.linkText("Dropdown")).click();
		// Clicks on the "Dropdown" option using link text

		Thread.sleep(2000);
		// Waits for the Dropdown page to load

		WebElement d = driver.findElement(By.id("country_code"));
		// Locates the dropdown element using its id attribute

		Select s = new Select(d);
		// Creates a Select class object to interact with the dropdown

		s.selectByVisibleText("+44");
		// Selects the dropdown option with visible text "+44"

		Thread.sleep(1000);
		// Waits for 1 second

		s.selectByIndex(3);
		// Selects the dropdown option at index position 3

		Thread.sleep(1000);
		// Pauses execution for 1 second

		s.selectByValue("+91");
		// Selects the dropdown option with value attribute "+91"

		Thread.sleep(1000);
		// Waits for 1 second

		s.selectByContainsVisibleText("+92");
		// Selects a dropdown option that contains visible text "+92"

		Thread.sleep(2000);
		// Final wait of 2 seconds before ending execution

		driver.quit();
	}

}
