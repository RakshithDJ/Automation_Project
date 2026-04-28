package PractiseScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

/***
 *This Script handles MouseAction 
 * {@link TestScript24}
 * @author rakshith.s
 ***/

public class TestScript25 {
	
	    public static void main(String[] args) throws InterruptedException {

	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-notifications", "--start-maximized");

	        WebDriver driver = new ChromeDriver(options);
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	        driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");

	        // Locate draggable elements
	        WebElement mobileCharger = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
	        WebElement laptopCharger = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));

	        // Locate corresponding drop targets
	        WebElement mobileBox = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
	        WebElement laptopBox = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));

	        Actions actions = new Actions(driver);

	        // Drag Mobile Charger to Mobile Accessories
	        actions.dragAndDrop(mobileCharger, mobileBox).perform();
	        Thread.sleep(1000);

	        // Drag Laptop Charger to Laptop Accessories
	        actions.dragAndDrop(laptopCharger, laptopBox).perform();
	        Thread.sleep(2000);

	        driver.quit();
	    }
	}


