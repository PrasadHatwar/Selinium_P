package chrome_driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackForwordAndRefresh {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation jars\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		driver.get("http://www.facebook.com");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		driver.close();
		
	}

}
