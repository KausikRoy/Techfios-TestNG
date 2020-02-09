package practice_1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TechFiosTestCase {
	
	
@Test
	
	public void validUserShouldBeLogIn() {
	
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		
		
		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("abc123");
		
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.xpath("//*[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Add Contact')]")).click();
		

		driver.findElement(By.id("account")).sendKeys("Kausik Roy");
		
		driver.findElement(By.id("company")).sendKeys("Chop house gyro");
		
		driver.findElement(By.id("email")).sendKeys("rkausik74@gmail.com");
		
		driver.findElement(By.id("phone")).sendKeys("917-573-4982");
		
		driver.findElement(By.id("address")).sendKeys("1504 mountainside drive");
		
		driver.findElement(By.id("state")).sendKeys("Texas");
		
		driver.findElement(By.id("zip")).sendKeys("75002");
		
		driver.findElement(By.id("submit")).click();
		
		
		
		//driver.close();
		//driver.quit();
		
		
		
		
	}	
	
	

}
