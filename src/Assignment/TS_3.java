
package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 * This class is used to print the heading of all the news under the adventures
 * section in travel category of bbc news website.
 * 
 * @author rakshith.s
 */

public class TS_3 {

	public static void main(String[] args) {

		// Initialize a new Chrome WebDriver instance
		WebDriver driver = new ChromeDriver();
		// Maximize the browser window to full screen
		driver.manage().window().maximize();
		// Navigate to BBC News website
		driver.get("https://www.bbc.com/news");
		// Click on the Travel link to navigate to Travel section
		driver.findElement(By.xpath("(//a[text()='Travel'])[1]")).click();
		// Find all h2 elements under the Adventures section and store them in a list
		List<WebElement> heading = driver.findElements(By.xpath("//h2[text()='Adventures']/../../../..//h2"));
		// Iterate through each heading element in the list
		for (WebElement headingText : heading) {
			// Print the text content of each heading to the console
			System.out.println(headingText.getText());
		}
		// Close the WebDriver and terminate the browser session
		driver.quit();

	}

}
