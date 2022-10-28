package selenium_automation_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Collectionsusingselenium {

	@Test
	
	
	public void collectionsusingselenium() {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver Driver = new ChromeDriver();
		
		Driver.get("https://www.google.com/");
		
		List<WebElement> links = Driver.findElements(By.tagName("a"));
		
		int count = links.size();
		
		System.out.println(count);
		
		
		
		
		
		
		

	}

}
