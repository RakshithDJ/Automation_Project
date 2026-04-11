package PractiseScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 *PopUp Script yet be handlled.
 * @author rakshiths
 * {@link  }
 */


public class TestScript16 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/browser");
		driver.findElement(By.xpath("(//button[text()='view more'])[1]")).click();
		Thread.sleep(3000);
		driver.quit();
		
		

	}

}
