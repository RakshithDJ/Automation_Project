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
 * DemoQSP synchronization Automated
 * @author rakshiths
 */


class TestScript12 {

	public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new ChromeDriver();	
	driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15)); 
    // Navigate to the demo application URL
    driver.get("https://demoapps.qspiders.com/");

    // Click on the 'UI Testing Concepts' section link
    driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();

    // Wait until 'Synchronization' section is present in DOM and click it
    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//section[text()='Synchronization']"))).click();

    // Wait until 'Progress Bar' section is visible and click it
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[text()='Progress Bar']"))).click();

    // Wait until 'Start' button is visible and click it to begin the progress bar
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Start']"))).click();

    // Wait until the progress span shows '100%' and store the boolean result
    Boolean h = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//span[text()='100%']"), "100%"));

    // Print whether progress bar reached 100% (true/false)
    System.out.println(h);

    // Wait until 'With Timer' link is present in DOM and click it
    wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("With Timer"))).click();

    // Wait until the first input field is clickable and enter timer value '2'
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@placeholder])[1]"))).sendKeys("2");

    // Wait until 'Start' button is clickable and click it to begin the timed progress bar
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Start']"))).click();

    // Wait until the progress span shows '100%' and store the boolean result
    Boolean g = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//span[text()='100%']"), "100%"));

    // Print whether timed progress bar reached 100% (true/false)
    System.out.println(g);

    // Wait until 'With Element' link is present in DOM and click it
    wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("With Element"))).click();

    // Wait until the first input field is clickable and enter value '2'
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@placeholder])[1]"))).sendKeys("2");

    // Wait until 'Start' button is clickable and click it to begin the element-based progress bar
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Start']"))).click();

    // Wait until the progress span shows '100%' and store the boolean result
    Boolean i = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//span[text()='100%']"), "100%"));

    // Print whether element-based progress bar reached 100% (true/false)
    System.out.println(i);

    // Wait until the element with text 'Do you like Automation' is present and retrieve its text
    String text = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[text()='Do you like Automation']"))).getText();

    // Print the text retrieved from the 'Do you like Automation' element
    System.out.println(text);

    // Wait until 'With Element Disappear' link is present in DOM and click it
    wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("With Element Disappear"))).click();

    // Wait until the first input field is clickable and enter value '2'
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@placeholder])[1]"))).sendKeys("2");

    // Wait until 'Start' button is clickable and click it to begin the disappear-based progress bar
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Start']"))).click();

    // Wait until 'Do you like Automation' element is present and retrieve its text before it disappears
    String text2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[text()='Do you like Automation']"))).getText();

    // Wait until the progress span shows '100%' and store the boolean result
    Boolean l = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//span[text()='100%']"), "100%"));

    // Print whether disappear-based progress bar reached 100% (true/false)
    System.out.println(l);

    // Print the text retrieved from the 'Do you like Automation' element before it disappeared
    System.out.println(text2);
    
    Thread.sleep(2000);

    // Close the browser and end the WebDriver session
    driver.quit();
	 
		
	}

}

