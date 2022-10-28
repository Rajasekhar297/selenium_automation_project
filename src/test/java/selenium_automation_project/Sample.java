package selenium_automation_project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver kosmic = new ChromeDriver();
		
		kosmic.get("https://www.facebook.com/");
		
		kosmic.findElement(By.id("email")).sendKeys("8328624005");
		
		kosmic.findElement(By.id("pass")).sendKeys("Rajasekhar@297");
		
		kosmic.findElement(By.name("login")).click();
		
	   kosmic.findElement(By.xpath("(//input[@dir='ltr'])[1]")).sendKeys("Nandha");
	    
     
		kosmic.findElement(By.xpath("//span[@class='om3e55n1'])[2]")).click();
		
		
       
       
       
        
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	

}
