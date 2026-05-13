package PractiseScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript30 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0&scenario=1");
		Thread.sleep (2000);
		driver.findElement(By.xpath("//a[text()='Nested iframe']")).click();
		Thread. sleep (2000);
		driver.switchTo().frame(0);
		Thread. sleep (2000);
		String un = driver.findElement(By.xpath("//p[text()='Admin@gmail.com']")).getText();
		String pwd = driver.findElement(By.xpath("//p[text()='Admin@1234'][2]")).getText();
		System.out.println(un);
		System.out.println(pwd);
		driver.quit();
		
		

	}

}
