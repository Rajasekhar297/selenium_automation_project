package selenium_automation_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Methodsinselenium01 {

	
	public static void main(String[] args) {
		
	} {
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver Driver = new ChromeDriver();
		
		Driver.get("https://www.google.com/");
		
		WebElement googlesearchbox = Driver.findElement(By.name("q"));
		googlesearchbox.sendKeys("Iphone12");
		
		googlesearchbox.submit();
		

		
	}
}
