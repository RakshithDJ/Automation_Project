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
		System.out.println("The First HRX shoe price is :"+ S);
		Thread.sleep(2000);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@role='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Iphone 16",Keys.ENTER);
		Thread.sleep(2000);
		String S1=driver.findElement(By.xpath("((//div[contains(text(),'Apple iPhone 16')])[3]/../..//div[contains(text(),'₹')])[1]")).getText();
		System.out.println("The Third Iphone 16 price is: "+S1);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung S26",Keys.ENTER);
		Thread.sleep(2000);
	    String S3=	driver.findElement(By.xpath("//span[contains(text(),'Samsung')][last()]")).getText();
	    Thread.sleep(2000);
		System.out.println("The last samsung phone price is :"+S3);
		driver.quit();
	}

}
