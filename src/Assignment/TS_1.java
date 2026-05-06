package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS_1 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("http://mail.jspiders.com/contact-0");
		driver.navigate().to("https://demoapps.qspiders.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		Thread.sleep(2000);
		String Expected_Title = "DemoApps | Qspiders";
		String Actual_Title = driver.getTitle();
		if(Actual_Title.equals(Expected_Title)) {
			System.out.println("Title is matching");
		} else {
			System.out.println("Title is not matching");
		}
		System.out.println("Expected Title: " + Expected_Title);
		System.out.println("Actual Title: " + Actual_Title);
		
		driver.quit();
	
	}

}
