package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Face {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String driverExecutablePath = "C:\\Drivers\\DRIVER\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverExecutablePath);
//	webDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement element = driver.findElement(By.id("submit"));
	if(element != null)
	{
		System.out.println("Element foundby ID");	
}
}
}
