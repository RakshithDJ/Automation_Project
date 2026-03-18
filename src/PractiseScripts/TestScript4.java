package PractiseScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Open browser to Trigger the facebook and refersh the webpage 
 * Click on the Login button without entering the creditinals.
 * Get the color of the error message that has been displayed.  
 */

public class TestScript4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		Thread.sleep(2000);

		 // Locate the error message element
		        WebElement errorMsg = driver.findElement(By.xpath("//span[contains(text(),'The email address')]"));

		        // Get the CSS color property
		        String color = errorMsg.getCssValue("color");

		        System.out.println("Error message color: " + color);

		driver.quit();
		
		
	}
}
