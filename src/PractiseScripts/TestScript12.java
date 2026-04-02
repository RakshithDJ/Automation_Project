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


class TestScript12 {

	public static void main(String[] args) {

	WebDriver driver = new ChromeDriver();	
	driver.manage().window().maximize();
	WebDriverWait W = new WebDriverWait(driver,Duration.ofSeconds(5));
	driver.get("https://demoqa.com/");
	W.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Book Store Application"))).click(); 
	W.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Book Store Application']/..//*[@fill='currentColor'])[2]"))).click();
	W.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Login']"))).click();
	System.out.println("Waits Executed");
	driver.quit();
	

		
	}

}
