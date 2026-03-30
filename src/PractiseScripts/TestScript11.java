package PractiseScripts;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 * Open browsser & Navigate to flipkart application and type iphone 17 pro max in the search box and print all the autosuggetsions 
 * click on enter button in the search box & print all the mobile name and all the mobile price from the product list page. 
 * @link
 * @author rakshith.s
 */

public class TestScript11 {
	
	public static void main(String[] args) {
		
		
		    WebDriver driver = new ChromeDriver();		
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			// Navigate to the Flipkart application
			driver.get("https://www.flipkart.com/");

			// Click on the close (✕) button of the login popup
			driver.findElement(By.xpath("//span[@role='button']")).click();

			// Locate the search box and enter the product name "Iphone17pro"
			driver.findElement(By.name("q")).sendKeys("Iphone17pro");

			// Find all auto‑suggestion elements that contain the text "iphone17pro"
			// The result is stored as a List of WebElements
			List<WebElement> p = driver.findElements(By.xpath("//div[contains(text(),'iphone17pro')]"));

			// Get the count of auto‑suggestions present in the list
			p.size();

			// Create an Iterator to traverse through the list of auto‑suggestions
			Iterator<WebElement> itr = p.iterator();

			// Loop through all the auto‑suggestions using Iterator
			while(itr.hasNext())
			{
			    // Print the text of each auto suggestion
			    System.out.println(itr.next().getText());
			}            

			// Close the browser and end the session
			driver.quit();
            
	}

}
