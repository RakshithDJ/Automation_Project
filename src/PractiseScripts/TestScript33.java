package PractiseScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestScript33 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		driver.get(" https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='PIM']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Employee List']")).click();Thread.sleep(2000);
		driver.findElement(By.linkText("Add Employee")).click();Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("jhon");Thread.sleep(2000);
		driver.findElement(By.name("middleName")).sendKeys("son");Thread.sleep(2000);
		driver.findElement(By.name("lastName")).sendKeys("doe");Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class]/parent::div)[6]")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	
	}

}
