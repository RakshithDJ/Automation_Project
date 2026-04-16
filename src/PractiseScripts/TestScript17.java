package PractiseScripts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 * {@link TestScript16}
 * @author rakshith.s
 */
public class TestScript17 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// Creates a new instance of ChromeDriver to control the Chrome browser

		driver.manage().window().maximize();
		// Maximizes the browser window for better visibility and to avoid hidden elements

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Sets an implicit wait of 5 seconds, so WebDriver waits before throwing NoSuchElementException

		driver.get("https://demoapps.qspiders.com/");
		// Opens the specified URL in the Chrome browser

		Thread.sleep(2000);
		// Pauses the execution for 2 seconds to ensure the page loads completely

		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		// Locates and clicks on the "UI Testing Concepts" option using visible text

		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		// Clicks on the "Popups" section under UI Testing Concepts

		Thread.sleep(2000);
		// Waits for the Popups menu and related elements to load

		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		// Selects the "Javascript" option inside the Popups section

		Thread.sleep(2000);
		// Allows time for JavaScript popup options to be displayed

		driver.findElement(By.linkText("Prompt")).click();
		// Clicks on the "Prompt" link to open a JavaScript prompt popup example

		Thread.sleep(2000);
		// Waits for the prompt UI and related elements to become visible

		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		// Selects the first checkbox available on the page using indexed XPath

		driver.findElement(By.id("deleteButton")).click();
		// Clicks the delete button, which triggers a JavaScript prompt alert

		driver.switchTo().alert().sendKeys("hello");
		// Switches control to the alert prompt and enters the text "hello"

		driver.quit();
		// Closes all browser windows and safely ends the WebDriver session
		
		
	}

}
