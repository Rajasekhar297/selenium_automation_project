package selenium_automation_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class nextpagelinksusingcollectinandif {

	public static void main(String[] args) {

    WebDriverManager.chromedriver().setup();
    
    ChromeDriver Driver = new ChromeDriver();
    
    Driver.get("https://www.google.com/");
    
    Driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("facebook");
    
    Driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).click();
    
    List<WebElement> Links = Driver.findElements(By.tagName("a"));
    
    int Number = Links.size();
    
    for(int i = 0; i< Number;i ++)
    
    System.out.println(Links.get(i).getText());
    
    
    
    
    
    
    
	
	}

}
