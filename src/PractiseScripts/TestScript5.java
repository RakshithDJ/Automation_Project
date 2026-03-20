package PractiseScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript5 {

	public static void main(String[] args) throws InterruptedException {

		// Launch Chrome browser
		WebDriver driver = new ChromeDriver();

		// Maximize the browser window
		driver.manage().window().maximize();

		// Apply implicit wait of 5 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Open MakeMyTrip website
		driver.get("https://www.makemytrip.com/");

		// Pause execution for 2 seconds to allow page to load
		Thread.sleep(2000);

		// Capture the text of the 'Flights' menu option using XPath
		String H = driver.findElement(By.xpath("(//li[@class='menu_Flights']/..//span[text()='Flights'])[1]")).getText();

		// Check whether the 'Flights' option is displayed
		boolean flightDisplayed = driver.findElement(By.xpath("(//li[@class='menu_Flights']/..//span[text()='Flights'])[1]")).isDisplayed();

		// Print the boolean result (true/false)
		System.out.println(flightDisplayed);

		// Print the text value of the Flights element
		System.out.println(H);
		
		driver.quit();
	
	}
}