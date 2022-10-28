package selenium_automation_project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample2 {
	

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver kosmic = new ChromeDriver();
		
		kosmic.get("https://www.gmail.com/");
		
		kosmic.findElement(By.id("identifierId")).sendKeys("rajnanda297@gmail.com");
		
        kosmic.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]")).click();
        
        
        
        
       
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	

}
