package PractiseScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

/***
 * This TestScriipt will automate the process of navigating to a demo application with nested iframes, extracting credentials from the iframe, and using those credentials to fill out a form in the main content area. It demonstrates the use of both implicit and explicit waits to handle dynamic web elements effectively.
 * swticthTo().frame() method is used to switch the driver's context to the nested iframe to access the elements within it, and then switch back to the main content to interact with the form fields.
 * @author rakshith.s
 */

public class TestScript28 {

	public static void main(String[] args) throws InterruptedException {
	
		// Initialize ChromeDriver and configure basic settings
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Create WebDriverWait object with 10 seconds timeout for explicit waits
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		// Navigate to the frames demo application URL
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0&scenario=1");
		Thread.sleep(2000);
		
		// Click on 'Nested iframe' link to navigate to nested iframe scenario
		driver.findElement(By.xpath("//a[text()='Nested iframe']")).click();
		Thread.sleep(2000);
		
		// Wait for iframe element to be present and switch to the nested iframe
		WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("iframe")));
		driver.switchTo().frame(iframe);
		Thread.sleep(1000);
		
		// Extract username and password credentials from the iframe using explicit wait
		String un = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[text()='Admin@gmail.com']"))).getText();		
		String pwd = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[text()='Admin@1234']"))).getText();
		
		// Print the extracted credentials to console
		System.out.println("Username: " + un);
		System.out.println("Password: " + pwd);
		
		// Switch back to main frame/content from nested iframe
		driver.switchTo().frame(0);
		
		// Fill the email field with the extracted username
		driver.findElement(By.id("email")).sendKeys(un);
		
		// Fill the password field with the extracted password
		driver.findElement(By.id("password")).sendKeys(pwd);
		
		// Fill the confirm password field with the password again
		driver.findElement(By.id("confirm-password")).sendKeys(pwd);
		
		// Click the submit button to submit the form
		driver.findElement(By.id("submitButton")).click();
		
		// Wait for page to process the form submission
		Thread.sleep(2000);
		
		// Close the browser and end the test session
		driver.quit();
        
	}

}