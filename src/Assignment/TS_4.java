package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/***
 * This class is script to automate the process of checking all checkboxes on a webpage using Selenium WebDriver.
 * @author rakshith.s
 */

public class TS_4 {

public static void main(String[] args) throws InterruptedException {
	
	// Initialize Chrome WebDriver instance
	 WebDriver driver = new ChromeDriver();
	 // Maximize the browser window
	 driver.manage().window().maximize();
	 // Navigate to the demo application URL
	 driver.get("https://demoapps.qspiders.com/");
	 // Click on the 'UI Testing Concepts' link
	 driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	 // Create a WebDriverWait instance with 10 seconds timeout
	 WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
	 // Wait until 'Check Box' section is present and click it
	 w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//section[text()='Check Box']"))).click();
	 // Add 2 second pause for page to fully load
	 Thread.sleep(2000);
	 // Find all checkbox elements on the page and store in a List
	 List<WebElement> cb = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
	 // Get the total count of checkboxes
	 int count = cb.size();
	 // Loop through each checkbox element
	 for(WebElement checkBox : cb) {
	  // Click on the current checkbox
	  checkBox.click();
	  // Get the selection status of the checkbox
	  Boolean select = checkBox.isSelected();
	  // Print whether the checkbox is selected
	  System.out.println("CheckBoxSelected :" + select);
	 }
	 // Print the total number of checkboxes found
	 System.out.println("Total CheckBox :" + count);
	 // Close the browser and end the WebDriver session
	 driver.quit();

	
}
}
