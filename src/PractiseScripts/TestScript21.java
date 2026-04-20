package PractiseScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/***
 * This TestScript-21 will handles the notification popup
 * {@link  {@link TestScript20 ,TestScript17, TestScript16 }TestScript19,TestScript18 ,TestScript17, TestScript16 }
 * @author rakshith.s
 */
public class TestScript21 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions options = new ChromeOptions();
		// Creates a ChromeOptions object to customize Chrome browser behavior

		options.addArguments("--disable-notifications", "--start-maximized");
		// Disables browser notifications and starts Chrome in maximized mode

		WebDriver driver = new ChromeDriver(options);
		// Launches a new Chrome browser instance with the specified options, controlled by Selenium WebDriver

		// driver.manage().window().maximize();
		// (Optional) Maximizes the browser window; commented out because --start-maximized is already used

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Sets an implicit wait of 5 seconds for locating elements before throwing NoSuchElementException

		driver.get("https://demoapps.qspiders.com");
		// Navigates the browser to the QSpiders demo application URL

		Thread.sleep(2000);
		// Hard wait of 2 seconds to allow the home page to load completely

		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		// Finds and clicks the "UI Testing Concepts" option using XPath with exact visible text

		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		// Locates and clicks the "Popups" section under UI Testing Concepts

		Thread.sleep(2000);
		// Hard wait of 2 seconds to ensure the Popups page loads fully

		driver.findElement(By.xpath("//section[text()='Notifications']")).click();
		// Clicks on the "Notifications" subsection to open notification-related actions

		driver.findElement(By.id("browNotButton")).click();
		// Clicks the browser notification button using its unique ID

		Thread.sleep(5000);
		// Hard wait of 5 seconds to observe the browser notification behavior

		driver.quit();
		// Closes all browser windows and safely ends the WebDriver session
		
	}

}
