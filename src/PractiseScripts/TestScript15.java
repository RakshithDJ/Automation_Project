package PractiseScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/***
 * This TestScript will handle search select dropdown.
 * {@link TestScript14}
 * @author rakshith.s
 */

//Changes need to be done 

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
		
		driver.findElement(By.xpath("(//*[@aria-hidden='true'])[1]")).click();
		
		driver.findElement(By.xpath("//div[@role='option' and text()='+92']")).click();
		
		driver.findElement(By.xpath("//div[text()='Select Gender']")).click();
		
		//driver.findElement(By.xpath("")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		    
	    }	
	    

	}


