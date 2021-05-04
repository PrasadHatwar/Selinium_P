package chrome_driver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation jars\\chromedriver\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("dr.prasadhatwar@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Pn9823665941");
		driver.findElement(By.name("login")).click();
	}
		
}
