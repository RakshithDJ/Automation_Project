package PractiseScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/***
 * This TestScript defines Waits 
 * Implicit wait
 * Explicit wait 
 * custom wait 
 * Fluent wait
 ***/

//Failing need to be reviewed
class TestScript12 {

	public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new ChromeDriver();	
	driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(25));
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//section[text()='Synchronization']"))).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[text()='Progress Bar']"))).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Start']"))).click();
    Boolean h =wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//span[text()='100%']"),"100%"));
    System.out.println(h);
    driver.quit();
	 
		
	}

}

