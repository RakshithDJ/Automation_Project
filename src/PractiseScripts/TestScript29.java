package PractiseScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/***
 * This class is used handle property file.
 *  Data Driven Testing
 *  Testing the application with multiple data in external file like property file, excel file, csv file etc is known as  Driven Testing.
 *  According to automation standard we should never hard code the data in the script. We should keep the data in external file and read it from there.
 *  In property file we can store the data in key and value pair. We can read the data from property file by using Properties class in java.
 *  In order to create property file we need to create a file with .property extension and store the data in key and value pair.
 *  FileInputStream is used to read the data from file.Here we convert high level data into low level data and read it from file. We need to provide the path of the file in FileInputStream constructor.
 *  In order to read the data from property file we need to create an object of Properties class and call the load method and pass the FileInputStream object as argument. This will load the data from file into Properties object.
 *  @author rakshith.s 	
 */

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
