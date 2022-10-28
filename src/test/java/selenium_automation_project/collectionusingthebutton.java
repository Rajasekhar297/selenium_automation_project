package selenium_automation_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class collectionusingthebutton {
@Test
	public void collectionusingthebutton() {
		
		WebDriverManager.chromedriver().setup();
		
	ChromeDriver Driver = new ChromeDriver();
	
	Driver.get("https://www.flipkart.com/");
	
	List<WebElement> Links = Driver.findElements(By.tagName("a"));
	
	int count = Links.size();
	
	for(int i = 0; i < count; i++) {
		
		System.out.println(Links.get(i).getText());
		
		
	}
	
	}

	}


