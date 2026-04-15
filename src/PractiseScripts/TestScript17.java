package PractiseScripts;

import java.time.Duration;

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
		// Launches a new Chrome browser instance

		driver.manage().window().maximize();
		// Maximizes the browser window

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Sets an implicit wait of 5 seconds for all element searches

		driver.get("https://demoapps.qspiders.com/");
		// Navigates to the QSpiders demo applications website

		Thread.sleep(2000);
		// Pauses execution for 2 seconds to allow page loading

		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		// Clicks on the "UI Testing Concepts" option on the homepage

		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		// Clicks on the "Popups" section under UI Testing Concepts

		Thread.sleep(2000);
		// Waits for popup-related options to load

		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		// Selects the "Javascript" popup section

		
		
	}

}
