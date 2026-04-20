package PractiseScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


/***
 * This TestScript-22 will handles the Download popup
 * {@link  {@link TestScript21,TestScript20 ,TestScript17, TestScript16 }TestScript19,TestScript18 ,TestScript17, TestScript16 }
 * @author rakshith.s
 */

public class TestScript22 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		// Creates a ChromeOptions object to customize Chrome browser behavior

		options.addArguments("--disable-notifications", "--start-maximized");
		// Disables browser notifications and launches the browser in maximized mode

		WebDriver driver = new ChromeDriver(options);
		// Starts a new Chrome browser session using the specified ChromeOptions

		// driver.manage().window().maximize();
		// Optional window maximize method; not required because --start-maximized is already used

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Sets an implicit wait of 5 seconds for all element lookups

		driver.get("https://demoapps.qspiders.com");
		// Opens the QSpiders demo application in the browser

		Thread.sleep(2000);
		// Hard wait of 2 seconds to allow the page to load fully

		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		// Clicks on the "UI Testing Concepts" option using text-based XPath

		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		// Navigates to the "Popups" section under UI Testing Concepts

		Thread.sleep(2000);
		// Hard wait of 2 seconds to ensure Popups page is completely loaded

		driver.findElement(By.xpath("//section[text()='Download']")).click();
		// Opens the "Download" popup section

		driver.findElement(By.id("writeArea")).sendKeys("This is download Popup");
		// Enters text into the download popup text area

		WebElement d = driver.findElement(By.id("fileName"));
		// Locates the filename input field and stores it in a WebElement reference

		d.clear();
		// Clears any existing text from the filename input field

		d.sendKeys("DownloadPop");
		// Enters a new filename for the download popup

		Thread.sleep(2000);
		// Hard wait of 2 seconds to allow user-observable actions to complete

		driver.findElement(By.id("downloadButton")).click();
		// Clicks the download button to trigger the file download

		Thread.sleep(2000);
		// Hard wait of 2 seconds to observe the download action

		driver.quit();
		// Closes all browser windows and ends the WebDriver session
		
		
		
		
		
		
		
		
		
		

		
		
		
	}
}
