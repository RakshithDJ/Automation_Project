package PractiseScripts;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 * Open browsser & Navigate to flipkart application and type iphone 17 pro max in the search box and print all the autosuggetsions.
 * click on enter button in the search box & print all the mobile name and all the mobile price from the product list page. 
 * @link TestScript10
 * @author rakshith.s
 */

public class TestScript11 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Navigate to the Flipkart application
		driver.get("https://www.flipkart.com/");

		// Click on the close (✕) button of the login popup to access homepage
		driver.findElement(By.xpath("//span[@role='button']")).click();

		// Locate the search box using name attribute and enter the product name
		// "Iphone17pro"
		WebElement E = driver.findElement(By.name("q"));
		E.sendKeys("Iphone17pro");

		// Find all auto‑suggestion elements that contain the text "iphone17pro"
		// These suggestion elements are stored in a List of WebElements
		List<WebElement> p = driver.findElements(By.xpath("//div[contains(text(),'iphone17pro')]"));

		// Get the total count of autosuggestions present in the list
		p.size();

		// Create an Iterator object to traverse through the list of autosuggestions
		Iterator<WebElement> itr = p.iterator();

		// Use while loop to iterate through each autosuggestion element
		while (itr.hasNext()) {

		// Print the text/value of each autosuggestion in the console
		System.out.println(itr.next().getText());
		}

		// Press ENTER key in the search box to perform search operation
		E.sendKeys(Keys.ENTER);

		// Locate all mobile name elements which contain text "Apple iPhone 17 Pro"
		List<WebElement> mobileName = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone 17 Pro')]"));

		// Get the total number of mobile names present
		int mn = mobileName.size();

		// Locate all corresponding mobile price elements using following axis in XPath
		List<WebElement> mobilePrice = driver
				.findElements(By.xpath("//div[contains(text(),'Apple iPhone ')]/following::div[7]"));

		// Get the total number of mobile prices present
		int mp = mobilePrice.size();

		// Loop through both mobile name and mobile price lists using index
		for (int i = 0; i < mn && i < mp; i++) {
		// Get mobile name at current index
		WebElement MN = mobileName.get(i);

		// Get mobile price at current index
		WebElement Mp = mobilePrice.get(i);

		// Print mobile name along with its price
		System.out.println(MN.getText() + " " + Mp.getText());
		}

		// Wait for 2 seconds before closing the browser
		Thread.sleep(2000);

		// Close the browser and end the session
		driver.quit();
            
	}

}
