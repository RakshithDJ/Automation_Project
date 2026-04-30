package PractiseScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

/***
 * This Script handles MouseActions 
 * Icon Script
 * {@link TestScript26 ,TestScript25,}
 * @author rakshith.s
 ***/

public class TestScript27 {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeOptions options = new ChromeOptions();
		// Creating ChromeOptions object to customize Chrome browser behavior

		options.addArguments("--disable-notifications", "--start-maximized");
		// Disables browser notifications and launches Chrome in maximized mode

		WebDriver driver = new ChromeDriver(options);
		// Launches Chrome browser with the specified options

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Sets an implicit wait of 5 seconds for element discovery

		driver.get("https://demoapps.qspiders.com/ui/mouseHover");
		// Navigates to the QSpiders mouse hover demo page
	
		driver.findElement(By.xpath("//a[text()='Image']")).click();
		
		WebElement img = driver.findElement(By.xpath("(//img)[2]"));
		
		Actions a = new Actions(driver);
		a.moveToElement(img).perform();
		
		Thread.sleep(5000);
		System.out.println("Hovered on image");
		
		driver.quit();

	}

}
