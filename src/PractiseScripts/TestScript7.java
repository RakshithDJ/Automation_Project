package PractiseScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 * To Print all the links in flipkart 
 * This is done using FindElements 
 */

public class TestScript7 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		// Opens the Flipkart website in the browser
		driver.get("https://www.flipkart.com/");

		// Clicks on the close (X) button of the login popup
		driver.findElement(By.xpath("//span[@role='button']")).click();

		// Refreshes the current Flipkart webpage
		driver.navigate().refresh();

		// Waits for 2 seconds to allow page elements to load after refresh
		Thread.sleep(2000);

		// Finds all anchor (<a>) elements on the page using TagName
		List<WebElement> D = driver.findElements(By.tagName("a"));

		// Stores the total number of links found on the webpage
		int count = D.size();

		// Prints the total count of anchor tags
		System.out.println(count);

		// Iterates through each link present on the webpage
		for (int i = 0; i < count; i++) {

			// Retrieves the current WebElement from the list
			WebElement W = D.get(i);

			// Prints the index and visible text of each link
			System.out.println(i + ":" + W.getText());
		}

		// Closes the browser and ends the WebDriver session
		driver.quit();

	}

}
