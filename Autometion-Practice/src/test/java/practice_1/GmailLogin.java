package practice_1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {
	
	@Test
	public void gmailLogin() throws InterruptedException {
		
	
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("yDmH0d")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("yDmH0d")).sendKeys("rkausik74@gmail.com");
	}

}
