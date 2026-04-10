package PractiseScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
		// Clicks on the "UI Testing Concepts" section using XPath

		Thread.sleep(2000);
		// Waits for the UI Testing Concepts page to load

		driver.findElement(By.linkText("Dropdown")).click();
		// Clicks on the "Dropdown" option using link text

		driver.findElement(By.linkText("Search With Select")).click();
		// Clicks on the "Search With Select" option to open the dropdown page

		driver.findElement(By.xpath("(//*[@aria-hidden='true'])[1]")).click();
		// Clicks on the first dropdown icon (country code selector)

		Thread.sleep(2000);
		// Waits for dropdown options to be visible

		driver.findElement(By.xpath("//div[@role='option' and text()='+92']")).click();
		// Selects the country code +92 from dropdown options

		Thread.sleep(2000);
		// Waits after selecting country code

		driver.findElement(By.xpath("(//input[@role='combobox'])[2]")).sendKeys("Female", Keys.ENTER);
		// Selects "Female" from the gender combobox

		Thread.sleep(3000);
		// Waits after selecting gender

		driver.findElement(By.xpath("(//input[@role='combobox'])[3]")).sendKeys("India", Keys.ENTER);
		// Selects "India" from the country combobox

		Thread.sleep(3000);
		// Waits after selecting country

		driver.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys("Karnataka", Keys.ENTER);
		// Selects "Karnataka" from the state combobox

		Thread.sleep(3000);
		// Waits after selecting state

		driver.findElement(By.xpath("(//input[@role='combobox'])[5]")).sendKeys("Bangalore Urban", Keys.ENTER);
		// Selects "Bangalore Urban" from the district combobox

		Thread.sleep(3000);
		// Waits after selecting district

		driver.findElement(By.xpath("(//input[@role='combobox'])[6]")).sendKeys("3", Keys.ENTER);
		// Selects value "3" from the final combobox (index-based selection)

		Thread.sleep(2000);
		// Waits before clicking continue button

		driver.findElement(By.id("continue")).click();
		// Clicks on the Continue button to submit the form

		Thread.sleep(2000);
		// Waits after form submission
		
		driver.quit();
		
		
		    
	    }	
	    

	}


