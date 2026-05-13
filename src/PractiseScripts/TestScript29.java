package PractiseScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript29 {

	public static void main(String[] args) throws IOException, InterruptedException { 
		
		
          WebDriver driver = new ChromeDriver();	
          driver.manage().window().maximize();
		  FileInputStream fis = new FileInputStream("./data/commondata.property");
		  Properties p = new Properties(); p.load(fis); 
		  String url = p.getProperty("url"); 
		  String username = p.getProperty("un"); 
		  String password = p.getProperty("pwd"); 
		  driver.get(url); 
		  Thread.sleep(2000);
		  driver.findElement(By.name("username")).sendKeys(username);
		  driver.findElement(By.name("password")).sendKeys(password);
		  driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		  Thread.sleep(2000);
		  driver.quit();
		  	 
		
	}
}
