// Package declaration for organizing the test scripts
package PractiseScripts;

// Import Duration class for setting up timeouts
import java.time.Duration;

// Import Selenium WebDriver related classes
import org.openqa.selenium.By;  // For locating elements by various strategies
import org.openqa.selenium.Keys;  // For keyboard keys like ENTER
import org.openqa.selenium.WebDriver;  // Main WebDriver interface
import org.openqa.selenium.chrome.ChromeDriver;  // ChromeDriver implementation

// Public class to run test scripts for web scraping from multiple e-commerce sites
public class TestScript1 {

	// Main method which is the entry point of the program
	public static void main(String[] args) throws InterruptedException {

		// Initialize ChromeDriver instance to automate Chrome browser
		WebDriver driver = new ChromeDriver();
		// Maximize the browser window to full screen
		driver.manage().window().maximize();
		// Set implicit wait timeout of 5 seconds for all element searches
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Commented out code for previous Selenium downloads test
//		/*
//		 * driver.get("https://www.selenium.dev/downloads/");
//		 * //driver.findElement(By.xpath("//p[text()='Ruby']//..//a[text()='API Docs']")
//		 * ).click(); driver.findElement(By.xpath("(//a[1])[22]")).click();
//		 */
		
		// Navigate to Myntra men-footwear section to extract HRX shoe price
		// Myntra Application fetching the first HRX shoe price using Relative Xpath
		// Navigate to Myntra website's men-footwear page
		driver.get("https://www.myntra.com/men-footwear");
		// Find the first HRX shoe price using XPath and store it in variable S
		String S=driver.findElement(By.xpath("(//h3[contains(text(),'HRX' )]/..//span[contains(text(),'Rs. ')])[1]")).getText();
		// Print the extracted HRX shoe price to console
		System.out.println("The First HRX shoe price is :"+ S);
		// Wait for 2 seconds to let the page load properly
		Thread.sleep(2000);
		// Navigate to Flipkart website
		driver.navigate().to("https://www.flipkart.com/");
		// Wait for 2 seconds for Flipkart page to load
		Thread.sleep(2000);
		// Click on the close/button element (likely to close a popup)
		driver.findElement(By.xpath("//span[@role='button']")).click();
		// Wait for 2 seconds after closing the popup
		Thread.sleep(2000);
		// Find the search box by name attribute and search for "Iphone 16" and press ENTER
		driver.findElement(By.name("q")).sendKeys("Iphone 16",Keys.ENTER);
		// Wait for 2 seconds for search results to load
		Thread.sleep(2000);
		// Find the third iPhone 16 product price from search results and store in S1
		String S1=driver.findElement(By.xpath("((//div[contains(text(),'Apple iPhone 16')])[3]/../..//div[contains(text(),'₹')])[1]")).getText();
		// Print the extracted iPhone 16 price to console
		System.out.println("The Third Iphone 16 price is: "+S1);
		// Navigate to Amazon India website
		driver.navigate().to("https://www.amazon.in/");
		// Wait for 2 seconds for Amazon page to load
		Thread.sleep(2000);
		// Find the search box by ID and search for "Samsung S26" and press ENTER
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung S26",Keys.ENTER);
		// Wait for 2 seconds for search results to load
		Thread.sleep(2000);
		// Find the last Samsung phone result from search results and store price in S3
	    String S3=	driver.findElement(By.xpath("//span[contains(text(),'Samsung')][last()]")).getText();
	    // Wait for 2 seconds before printing the result
	    Thread.sleep(2000);
		// Print the extracted Samsung phone price to console
		System.out.println("The last samsung phone price is :"+S3);
		// Close the browser and all associated windows
		driver.quit();
	}

}
