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
 * This class defines a test script that automates the process of searching for "iPhone 17" on the Flipkart website and prints the names and prices of the listed mobile phones.
 * @author rakshith.s
 */
public class TS_6 {
 public static void main(String[] args) {

  // Initialize ChromeDriver instance
  WebDriver driver = new ChromeDriver();

  // Maximize the browser window
  driver.manage().window().maximize();

  // Navigate to Flipkart website
  driver.get("https://www.flipkart.com/");

  // Create WebDriverWait with 10 seconds timeout
  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

  // Wait for and click the login/account button
  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@role='button']"))).click();

  // Find the search input field by name attribute
  WebElement E = driver.findElement(By.name("q"));

  // Type "iPhone 17" in the search field
  E.sendKeys("iPhone 17");

  // Submit the search query
  E.submit();

  // Find all mobile names containing "Apple iPhone"
  List<WebElement> mobileName =  driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone')]"));

  // Find all mobile prices (7th div following the product name)
  List<WebElement> mobileprice = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone')]/following::div[8]"));
  mobileprice.size();

     int mn = mobileName.size();
	// Get the total number of mobile prices present
	int mp = mobileprice.size();

	// Loop through both mobile name and mobile price lists using index
	for (int i = 0; i < mn && i < mp; i++) {
	// Get mobile name at current index
	WebElement MN = mobileName.get(i);

	// Get mobile price at current index
	WebElement Mp = mobileprice.get(i);

	// Print mobile name along with its price
	System.out.println(MN.getText() + " " + Mp.getText());
	}

    driver.quit();
}

  
}

		
		
