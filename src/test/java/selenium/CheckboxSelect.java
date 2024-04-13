package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxSelect {
	static WebDriver driver;

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// 1. click the specify check box

		driver.findElement(By.id("sunday")).click();

		// 2. select the all check boxes
/*
		
		  List<WebElement>allcheckbox=driver.findElements(By.
		 xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		  
		  for(WebElement allchb:allcheckbox) { allchb.click(); }
		 

		// 3. select multiple check boxes

		List<WebElement>allcheckbox=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));

		for(WebElement allchb:allcheckbox) {
			String name=allchb.getAttribute("id");
			if(name.equals("monday") || name.equals("friday")) {
				allchb.click();
			}
		}
		
		
		// 4. select last 3 check boxes 
	
	List<WebElement>allcheckbox=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
	int ceckboxcount=allcheckbox.size();
	
	for(int i=ceckboxcount-3; i<ceckboxcount; i++) {
		
		allcheckbox.get(i).click();
	}
	*/
		
		// 5. select first 2 check boxes
		
	List<WebElement>allcheckbox=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
	int ceckboxcount=allcheckbox.size();
	
	for(int i=0; i<ceckboxcount; i++) {
		
		if(i<2) {
			allcheckbox.get(i).click();
		}
	}
	
	

	}

}
