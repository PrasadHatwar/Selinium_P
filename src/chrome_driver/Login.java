package chrome_driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation jars\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com/");    
	}

}
