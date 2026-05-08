package Assignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/***
 * This class prints the search suggestions for "iPhone 17" on Flipkart website using Selenium WebDriver.
 * @author rakshith.s
 */


public class TS_5 {

public static void main(String[] args) throws InterruptedException {

    // Initialize Chrome WebDriver and maximize the browser window
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    // Set implicit wait of 5 seconds for all element searches
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    // Navigate to Flipkart website
    driver.get("https://www.flipkart.com/");
    Thread.sleep(2000);

    // Close the login popup by clicking the close button
    driver.findElement(By.xpath("//span[@role='button']")).click();

    // Find and interact with the search input field
    WebElement d = driver.findElement(By.name("q"));
    d.sendKeys("iPhone 17");

    // Wait for search suggestions to load
    Thread.sleep(1000);

    // Create explicit wait with 10 second timeout
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    // Wait for suggestion elements to be visible and retrieve them
    List<WebElement> suggestions = wait.until(
        ExpectedConditions.visibilityOfAllElementsLocatedBy(
            By.xpath("//div[contains(text(),'iphone 17 ')]")
        )
    );

    // Iterate through suggestions and print each one
    Iterator<WebElement> itr = suggestions.iterator();
    while(itr.hasNext()) {
        System.out.println(itr.next().getText());
    }

    // Close the browser and terminate the WebDriver session
    driver.quit();
}
}
