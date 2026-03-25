package Generic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PractiseScripts.TestScript8;

/***
 * Open Facebook Application and Print all the URL's in the WebPage
 * {@link TestScript8}
 * @author rakshith.s
 */

public class TestScript9 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		List<WebElement> L = driver.findElements(By.xpath("//a[@href]"));
		int count = L.size();
		for (int i = 0; i < count; i++) {
			WebElement link = L.get(i);
			System.out.println(link.getText());}
        System.out.println("The count of links are :"+count);
		

	}

}
