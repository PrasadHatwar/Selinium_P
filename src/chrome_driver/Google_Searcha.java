package chrome_driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Searcha {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation jars\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.navigate().refresh();
		driver.manage().deleteAllCookies();
		
		//System.out.println(driver.manage().window().getPosition().getX() + driver.manage().window().getPosition().getY());
//		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Facebook");
//		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
//		driver.findElement(By.xpath("/html/body/div[7]/div/div[9]/div[1]/div/div[2]/div[2]/div/div/div[1]/div[2]/div/div/div[1]/a/h3")).click();
//		driver.navigate().to("https://www.facebook.com/login/web/");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("linkedin");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		
		driver.findElement(By.xpath("/html/body/div[7]/div/div[9]/div[1]/div/div[2]/div[2]/div/div/div[1]/div[2]/div/div/div[1]/a/h3")).click();
		//driver.navigate().to("https://www.linkedin.com/");
		Thread.sleep(2000);
		driver.quit();
	}

}
