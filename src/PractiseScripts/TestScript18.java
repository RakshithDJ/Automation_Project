package PractiseScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/***
 * This TestScript handles the Hidden divison Popup. {@link TestScript17 , TestScript16}
 * 
 * @author rakshith.s
 */
public class TestScript18 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		// Launches a new Chrome browser instance controlled by Selenium WebDriver

		driver.manage().window().maximize();
		// Maximizes the browser window to ensure all elements are visible on screen

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Applies an implicit wait of 5 seconds for locating elements before throwing
		// an exception

		driver.get("https://demoapps.qspiders.com/");
		// Navigates the browser to the specified application URL

		Thread.sleep(2000);
		// Hard wait of 2 seconds to allow the home page to load fully

		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		// Locates the "UI Testing Concepts" option using exact text and clicks on it

		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		// Clicks on the "Popups" section under UI Testing Concepts

		Thread.sleep(2000);
		// Waits for the Popups menu and its child options to become visible

		driver.findElement(By.xpath("//section[text()='Hidden division']")).click();
		// Selects the "Hidden division" popup option

		Thread.sleep(1000);
		// Waits for the Hidden Division page to load

		driver.findElement(By.xpath("//button[text()='Add Customer']")).click();
		// Clicks on the "Add Customer" button to open the hidden division popup form

		Thread.sleep(1000);
		// Waits for the popup form to appear

		driver.findElement(By.id("customerName")).sendKeys("Jhon");
		// Enters the customer name into the Name input field

		Thread.sleep(1000);
		// Pause to visually observe the entered name

		driver.findElement(By.id("customerEmail")).sendKeys("demo@gmail.com");
		// Enters the customer email into the Email input field

		Thread.sleep(1000);
		// Pause to visually observe the entered email

		WebElement product = driver.findElement(By.id("prod"));
		// Locates the product dropdown element by its ID

		Select s = new Select(product);
		// Creates a Select object to handle dropdown selections

		s.selectByIndex(1);
		// Selects the second option in the product dropdown (index starts from 0)

		driver.findElement(By.id("message")).sendKeys("This is a hidden divison popup");
		// Enters a message into the message textarea field

		Thread.sleep(1000);
		// Pause before submitting the form

		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		// Clicks on the Submit button to submit the form

		Thread.sleep(2000);
		// Waits for submission result or confirmation to appear

		driver.quit();
		// Closes all browser windows and ends the WebDriver session

	}
}
