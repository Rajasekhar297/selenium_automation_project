package selenium_automation_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drive_if {

	@Test
	
	public  void driver_if() {
		
		String driver = "Chrome";
		
		if (driver=="Chrome") 
		{
			
		WebDriverManager.chromedriver().setup();
		ChromeDriver kosmic = new ChromeDriver();
		
		kosmic.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		kosmic.get("https://www.facebook.com/");
		kosmic.findElement(By.id("email")).sendKeys("8328624005");
		kosmic.findElement(By.id("pass")).sendKeys("Rajasekhar@297");
		kosmic.findElement(By.name("login")).click();
		
		
		
		
		
		
		
		}
		
		else if (driver=="Edge") 
		{
			
		WebDriverManager.edgedriver().setup();
		EdgeDriver kosmic = new EdgeDriver();
		kosmic.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		kosmic.get("https://www.facebook.com/");
		kosmic.findElement(By.id("email")).sendKeys("8328624005");
		kosmic.findElement(By.id("pass")).sendKeys("Rajasekhar@297");
		kosmic.findElement(By.name("login")).click();
		
		
		
		
		}
		else if (driver=="Opera") 
		{
			
		WebDriverManager.operadriver().setup();
		OperaDriver kosmic = new OperaDriver();
		kosmic.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		kosmic.get("https://www.facebook.com/");
		kosmic.findElement(By.id("email")).sendKeys("8328624005");
		kosmic.findElement(By.id("pass")).sendKeys("Rajasekhar@297");
		kosmic.findElement(By.name("login")).click();
		
		}
		else
		{
		
			System.out.println("Browser is not valid");
			
		}
			
		}
		
		
		
	}


