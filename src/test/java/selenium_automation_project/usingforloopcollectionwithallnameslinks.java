package selenium_automation_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class usingforloopcollectionwithallnameslinks {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver Driver = new ChromeDriver();
		
		Driver.get("https://www.google.com/");
		
		List<WebElement> links = Driver.findElements(By.tagName("a"));
		
		int Number = links.size();
		
		for(int i= 0; i < Number; i++){
	
			System.out.println(links.get(i).getText());
			
		}
			
	}

}
