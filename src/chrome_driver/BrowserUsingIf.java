package chrome_driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUsingIf {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		String s= "browser";
		String f= "browser";
		
		
		if(s.equals("browser"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Automation jars\\chromedriver\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com");
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			driver.findElement(By.id("menu_admin_viewAdminModule")).click();
			Thread.sleep(2000);
			driver.close();
			
		}
		if(f.equals("browser"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Automation jars\\firefox driver\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://opensource-demo.orangehrmlive.com");
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			driver.findElement(By.id("menu_admin_viewAdminModule")).click();
			Thread.sleep(2000);
			driver.close();
		}
		
//		driver.get("https://opensource-demo.orangehrmlive.com");
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		driver.findElement(By.id("btnLogin")).click();
//		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		
		Thread.sleep(2000);
		driver.close();
	}

}
