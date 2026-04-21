package PractiseScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/***
 * This TestScript-22 will handles the Print popup using Robot class
 * In order to perform keyboard actions anywhere in the system we make use of Robot class
 * In Robot class we have 2 non static methods like KeyPress and KeyRelease
 * These methods will take static variable from keyevent class as parameter 
 * In order to release the contol from functional keys like Shift , Window ,control Alt etc.We use KeyRelese(int)
 * {@link TestScript22 ,TestScript21, TestScript20 ,TestScript19,TestScript18 ,TestScript17, TestScript16 }
 * @author rakshith.s
 */

public class TestScript23 {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
        
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

		Robot r = new Robot();
		// Creates a Robot class object to perform keyboard actions at OS level

		Thread.sleep(2000);
		// Hard wait before triggering keyboard shortcuts

		r.keyPress(KeyEvent.VK_CONTROL);
		// Presses the Control key

		r.keyPress(KeyEvent.VK_P);
		// Presses the 'P' key while Control is held (Ctrl + P for Print command)

		r.keyPress(KeyEvent.VK_ENTER);
		// Presses the Enter key to confirm the print action

		r.keyRelease(KeyEvent.VK_CONTROL);
		// Releases the Control key

		r.keyRelease(KeyEvent.VK_P);
		// Releases the 'P' key

		r.keyRelease(KeyEvent.VK_ENTER);
		// Releases the Enter key

		Thread.sleep(2000);
		// Hard wait to observe the print popup/action

		driver.quit();
		// Closes all browser windows and ends the WebDriver session
		
		
	}

}
