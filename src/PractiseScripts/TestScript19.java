package PractiseScripts;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 * This TestScript handles the Hidden divison Popup. {@link TestScript17 ,
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

		driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();

		driver.findElement(By.xpath("(//button[text()='view more'])[2]")).click();

		Set<String> s = driver.getWindowHandles();

		System.out.println(s);

	}

}
