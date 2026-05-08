package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/***
 * This test script automates the login and logout process on the OrangeHRM demo site using Explicit and Implicit waits.
 * @author rakshith.s
 */

public class TS_7 {

	public static void main(String[] args) throws InterruptedException {

		// Initialize ChromeDriver instance
		WebDriver driver = new ChromeDriver();
		// Maximize the browser window
		driver.manage().window().maximize();
		// Set implicit wait of 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Navigate to OrangeHRM login page
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// Create WebDriverWait instance with 10 seconds timeout
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// Wait for username field and enter "Admin"
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username"))).sendKeys("Admin");
		// Wait for password field and enter "admin123"
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password"))).sendKeys("admin123");
		// Click the login submit button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		// Wait for and click the user profile icon
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//i[@class])[4]"))).click();
		// Wait for 2 seconds
		Thread.sleep(2000);
		// Click the logout link
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		// Wait for 5 seconds
		Thread.sleep(5000);
		// Close the browser and end the session
		driver.quit();
	}

}
