package PractiseScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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


/***
 * DemoQSP Synchorginazation Automated
 * @author rakshiths
 */


class TestScript12 {

	public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new ChromeDriver();	
	driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//section[text()='Synchronization']"))).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[text()='Progress Bar']"))).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Start']"))).click();
    Boolean h =wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//span[text()='100%']"),"100%"));
    System.out.println(h);
    wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("With Timer"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@placeholder])[1]"))).sendKeys("2");
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Start']"))).click();
    Boolean g =wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//span[text()='100%']"),"100%"));
    System.out.println(g);
    wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("With Element"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@placeholder])[1]"))).sendKeys("2");
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Start']"))).click();
    Boolean i =wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//span[text()='100%']"),"100%"));
    System.out.println(i);
    String text = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[text()='Do you like Automation']"))).getText();
    System.out.println(text);
    wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("With Element Disappear"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@placeholder])[1]"))).sendKeys("2");
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Start']"))).click();
    String text2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[text()='Do you like Automation']"))).getText();
    Boolean l =wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//span[text()='100%']"),"100%")); 
    System.out.println(l);
    System.out.println(text2);
    driver.quit();
	 
		
	}

}

