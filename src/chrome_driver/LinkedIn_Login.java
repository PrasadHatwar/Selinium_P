package chrome_driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedIn_Login {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation jars\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.linkedin.com/login");
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("prsdhtwr@gmail.com");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Pn9823665941");
		WebElement Login=driver.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button"));
		Login.click();
		
	}

}
