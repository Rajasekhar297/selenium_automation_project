package selenium_automation_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class linksnamingusingcollectionwithselenium {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int number = links.size();
		
		System.out.println(links.get(0).getText());
		System.out.println(links.get(1).getText());
        System.out.println(links.get(2).getText());
        System.out.println(links.get(3).getText());
        
		
		
	}

}
