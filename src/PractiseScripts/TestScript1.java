package PractiseScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		/*
//		 * driver.get("https://www.selenium.dev/downloads/");
//		 * //driver.findElement(By.xpath("//p[text()='Ruby']//..//a[text()='API Docs']")
//		 * ).click(); driver.findElement(By.xpath("(//a[1])[22]")).click();
//		 */
		
		//Myntra Application fetching the first HRX shoe price using Relative Xpath
		driver.get("https://www.myntra.com/men-footwear");
		String S=driver.findElement(By.xpath("(//h3[contains(text(),'HRX' )]/..//span[contains(text(),'Rs. ')])[1]")).getText();
		System.out.println(S);
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Iphone 16",Keys.ENTER);
		Thread.sleep(2000);
		String S1=driver.findElement(By.xpath("((//div[contains(text(),'Apple iPhone 16')])[3]/../..//div[contains(text(),'₹')])[1]")).getText();
		System.out.println(S1);
		
				
		
		driver.quit();

	}

}
