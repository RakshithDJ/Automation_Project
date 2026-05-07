package Assignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS_5 {

	public static void main(String[] args) throws InterruptedException {
	
		
		  WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.get("https://www.flipkart.com/"); Thread.sleep(2000);
		  driver.findElement(By.xpath("//span[@role='button']")).click();
		   WebElement d = driver.findElement(By.name("q"));
		    d.sendKeys("iPhone 17");
		 
   
            
       driver.quit();

	}

}
