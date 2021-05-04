package chrome_driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHrm {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation jars\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Prasad Hatwar");
		
		WebElement drp= driver.findElement(By.id("searchSystemUser_userType"));
		Select dropdown= new Select(drp);
		dropdown.selectByIndex(1);
		
		driver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys("Prasad Hatwar");
		
		Select drp2 =new Select(driver.findElement(By.id("searchSystemUser_status")));
		drp2.selectByIndex(2);
		
		driver.findElement(By.id("searchBtn")).click();
		
		Thread.sleep(2000);
		driver.close();
	}
}
