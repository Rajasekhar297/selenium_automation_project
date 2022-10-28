package selenium_automation_project;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class switchex {

	public static void main(String[] args) {
		
			String browser = "Chrome";
			
			switch (browser) 
				
			{
			case("Edge"):
				WebDriverManager.edgedriver().setup();
			EdgeDriver kosmic = new EdgeDriver();
			kosmic.get("https://www.facebook.com/");
			
	
			
			
			break;
			
			

			case ("Chrome"): 
				System.out.println("Chrome browser");
				
				WebDriverManager.chromedriver().setup();
				ChromeDriver object = new ChromeDriver();
				object.get("https://www.myntra.com/");
				
				break;
				
			default:
				
				System.out.println("Browser is invalid");
				
				

	}

	}
}
