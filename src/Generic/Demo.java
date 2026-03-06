package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
	 
	        WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://demoqa.com/");
		    Thread.sleep(2000);
		    driver.close();
		    
	}

}
