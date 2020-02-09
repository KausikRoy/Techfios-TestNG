package elementLocator;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindelementLocator {
	
@Test	
	
	
	public void exploreElement() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://techfios.com/test/billing/?ng=admin/");

		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		
		Thread.sleep(3000);

		driver.findElement(By.name("password")).sendKeys("abc123");
		Thread.sleep(3000);
		

		driver.findElement(By.name("login")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Add Contact')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Kausik Roy");
		
		
		
		
		
		
		
	}

}
