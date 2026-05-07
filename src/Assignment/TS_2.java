package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 * This class is designed to extract and print all the hyperlinks (URLs) from the Facebook homepage using Selenium WebDriver with ChromeDriver.
 * @author rakshith.s
 */

public class TS_2 {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	    List<WebElement> link = driver.findElements(By.tagName("a"));

	    // Iterate through each link and print its href URL
	    for(WebElement URL : link) {
	      String url = URL.getAttribute("href");
	      System.out.println(url);
	    }

	    // Close the browser
	    driver.quit();
	
	}
}
