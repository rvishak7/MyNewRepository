package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementById2 {
	
	public static void main(String[] args) {
		
		String driverExecutablePath = "C:\\Drivers\\DRIVER\\chromedriver.exe";    	
		System.setProperty("webdriver.chrome.driver", driverExecutablePath);
		
		
		
		int x= 6;
		
		//WebDriverManager.chromedriver().setup();
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box/");	
		
		WebElement el = driver.findElement(By.id("userName"));	
		
		
		el.sendKeys("Vishak Radhakrishnan");
		
		WebElement el2 = driver.findElement(By.id("userEmail"));	
		
		
		el2.sendKeys("rvishak7@gmail.com");
		
		WebElement el3 = driver.findElement(By.id("currentAddress"));	
		
		
		el3.sendKeys("no 42, Lily Lane,");
		
		WebElement el4 = driver.findElement(By.id("permanentAddress"));	
		
		
		el4.sendKeys("no 42, Lily Lane");
		
		driver.manage().window().maximize();	
		
		
		
		WebElement el5 = driver.findElement(By.id("submit"));

Actions actions = new Actions(driver);
actions.moveToElement(el5).click().perform();
((JavascriptExecutor) driver).executeScript("arguments[0].click();",el5);

					
	if(el4 != null) {
			    System.out.println("Element found by ID");
			    el5.click();
			    
		}
	}
		
	}
