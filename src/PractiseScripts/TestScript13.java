package PractiseScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 * This TestScript is of Handling dropdown 
 * Dropdown is an element which contians set of options 
 * In dropdown there are two types 
 * Single Select 
 * Multi Select
 * Generally dropdown will be created using select tag or div tag
 * If it is created using div it can handles using findelement()
 * If dropdown is created using option tag ,select tag then we use non static methods of select class to handle it 
 * In order to access non static methods we need to create object of Select class
 * Select class constructor will take webelement as parameter where need to pass the address of dropdown created using select tag.
 * 
 */


public class TestScript13 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Dropdown")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
