package PractiseScripts;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

/***
 * This Script handles MouseActions 
 * Icon Script
 * @author rakshith.s
 ***/

public class TestScript26 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		// Creating ChromeOptions object to customize Chrome browser behavior

		options.addArguments("--disable-notifications", "--start-maximized");
		// Disables browser notifications and launches Chrome in maximized mode

		WebDriver driver = new ChromeDriver(options);
		// Launches Chrome browser with the specified options

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Sets an implicit wait of 5 seconds for element discovery

		driver.get("https://demoapps.qspiders.com/ui/mouseHover");
		// Navigates to the QSpiders mouse hover demo page

		WebElement m = driver.findElement(By.xpath("(//img[@src])[3]"));
		// Locates the third image element on the page which requires mouse hover action

		Thread.sleep(2000);
		// Pauses execution for 2 seconds to ensure page stability before hovering

		Actions a = new Actions(driver);
		// Creates an Actions class object to perform advanced user interactions

		a.moveToElement(m).perform();
		// Performs mouse hover (move to element) action on the identified image

		driver.quit();
		// Closes the browser and ends the WebDriver session
	
	}

}