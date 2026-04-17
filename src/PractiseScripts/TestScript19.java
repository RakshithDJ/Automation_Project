package PractiseScripts;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 * This TestScript handles the Browser window Popup. {@link TestScript17 ,
 * TestScript16}
 * 
 * @author rakshith.s
 ***/

public class TestScript19 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		// Launches a new Chrome browser instance controlled by Selenium WebDriver

		driver.manage().window().maximize();
		// Maximizes the browser window to ensure all elements are visible on screen

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Applies an implicit wait of 5 seconds for locating elements before throwing
		// a NoSuchElementException

		driver.get("https://demoapps.qspiders.com/");
		// Navigates the browser to the specified application URL

		Thread.sleep(2000);
		// Hard wait of 2 seconds to allow the home page to load fully

		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		// Locates the "UI Testing Concepts" option using its visible text and clicks it

		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		// Clicks on the "Popups" section under UI Testing Concepts

		Thread.sleep(2000);
		// Waits for the Popups menu and its child options to become visible

		driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
		// Clicks on the "Browser Windows" option to navigate to browser window examples

		driver.findElement(By.xpath("(//button[text()='view more'])[2]")).click();
		// Clicks the second "view more" button which opens a new browser window

		Set<String> s = driver.getWindowHandles();
		// Stores all unique window handles (parent + child windows) in a Set

		Iterator<String> itr = s.iterator();
		// Creates an iterator to traverse through the window handles

		// Get Parent Window ID
		String parentWindow = itr.next();
		// Stores the first window handle as the parent window

		// Get Child Window ID
		String childWindow = itr.next();
		// Stores the second window handle as the child window

		// Switch to Child Window
		driver.switchTo().window(childWindow);
		// Transfers Selenium control from parent window to child window

		System.out.println("ChildWindow ID :" + " " + childWindow);
		// Prints the child window ID in the console

		driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
		// Clicks the "Add to Cart" button present in the child window

		driver.findElement(By.tagName("article")).click();
		// Clicks on the article element to bring focus or trigger UI behavior

		String price = driver.findElement(By.xpath("(//span)[2]")).getText();
		// Retrieves the text value of the second span element which contains price

		System.out.println("Price :" + price);
		// Prints the fetched price on the console

		driver.close();
		// Closes the currently active window (child window)

		driver.switchTo().window(parentWindow);
		// Switches control back to the parent window

		driver.quit();
		// Closes all browser windows and ends the WebDriver session
	

	}

}
