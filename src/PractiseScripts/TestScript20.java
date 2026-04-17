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

// Script need to be updated properly kept on hold


public class TestScript20 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		// Launches a new Chrome browser instance controlled by Selenium WebDriver

		driver.manage().window().maximize();
		// Maximizes the browser window to ensure all elements are visible on screen

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Applies an implicit wait of 5 seconds for locating elements before throwing
		// a NoSuchElementException

		driver.get("https://admin :admin@demoapps.qspiders.com/ui/auth?");
		// Navigates the browser to the specified application URL

		Thread.sleep(2000);
		// Hard wait of 2 seconds to allow the home page to load fully

		driver.findElement(By.id("AuthLink")).click();

		Set<String> h = driver.getWindowHandles();

		Iterator<String> itr = h.iterator();

		String parentWindow = itr.next();
		String childWindow = itr.next();

		driver.switchTo().window(childWindow);
		Thread.sleep(3000);
		/*
		 * driver.close(); Thread.sleep(2000); driver.switchTo().window(parentWindow);
		 * Thread.sleep(2000); driver.quit();
		 */
		
	}
}
