package PractiseScripts;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 * This TestScript handles the Authentication Popup. 
 * {@link TestScript18 ,TestScript17, TestScript16 }
 * @author rakshith.s
 ***/


public class TestScript20 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		// Launches a new Chrome browser instance controlled by Selenium WebDriver

		driver.manage().window().maximize();
		// Maximizes the browser window to ensure all elements are visible on screen

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Applies an implicit wait of 5 seconds for locating elements before throwing a NoSuchElementException

		driver.get("https://demoapps.qspiders.com/ui/auth?");
		// Navigates the browser to the specified application URL

		Thread.sleep(2000);
		// Hard wait of 2 seconds to allow the home page to load fully

		driver.findElement(By.id("AuthLink")).click();
		// Locates the element with id 'AuthLink' and performs a click action

		driver.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
		// Opens a URL with basic authentication using username and password embedded in the URL

		Thread.sleep(5000);
		// Hard wait of 5 seconds to allow the authenticated page to load

		Set<String> h = driver.getWindowHandles();
		// Retrieves all window handles (IDs) currently opened by the browser

		Iterator<String> itr = h.iterator();
		// Creates an iterator to traverse through the window handles

		String parentWindow = itr.next();
		// Stores the first window handle as the parent (original) window

		String childWindow = itr.next();
		// Stores the second window handle as the child (newly opened) window

		driver.switchTo().window(childWindow);
		// Switches Selenium control from the parent window to the child window

		Thread.sleep(5000);
		// Hard wait of 5 seconds to observe actions in the child window

		driver.close();
		// Closes the currently active window (child window)

		Thread.sleep(5000);
		// Hard wait of 5 seconds after closing the child window

		driver.switchTo().window(parentWindow);
		// Switches Selenium control back to the parent window

		Thread.sleep(5000);
		// Hard wait of 5 seconds to observe actions in the parent window

		driver.quit();
		// Closes all browser windows and ends the WebDriver session
		 
		
	}
}
