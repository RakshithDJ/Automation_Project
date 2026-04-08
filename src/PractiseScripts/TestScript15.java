package PractiseScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/***
 * This TestScript will handle search select dropdown.
 * {@link TestScript14}
 * @author rakshith.s
 */

public class TestScript15 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		//Launches a new Chrome browser instance

		driver.manage().window().maximize();
		//Maximizes the browser window

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Sets an implicit wait of 5 seconds for all element searches

		driver.get("https://demoapps.qspiders.com/");
		//Navigates to the QSpiders demo applications website

		Thread.sleep(2000);
		//Pauses execution for 2 seconds to allow page loading

		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		// Clicks on the "UI Testing Concepts" section using XPath

		Thread.sleep(2000);
		//Waits for the UI Testing Concepts page to load

		driver.findElement(By.linkText("Dropdown")).click();
		//Clicks on the "Dropdown" option using link text

		driver.findElement(By.linkText("Search With Select")).click();
		//Clicks on the "search with Select" option to open the multi-select dropdown page.
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@aria-hidden=\"true\"])[1]"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='react-select-2-input']")).sendKeys("+92",Keys.ENTER);	
		
		Thread.sleep(2000);
		 driver.quit();
		    
	    }	
	    

	}


