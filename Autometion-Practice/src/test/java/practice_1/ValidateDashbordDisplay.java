package practice_1;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidateDashbordDisplay {
	
@Test	
	
	public void dashbordDisplayValidation() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS );

		driver.get("http://techfios.com/test/billing/?ng=admin/");

		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.name("password")).sendKeys("abc123");

		driver.findElement(By.name("login")).click();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Instantiate WebDriverWait
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//Creating the variable name for the dashbord element locator
		String dashbordLocator ="//div[@id='page-wrapper']//descendant::h2";
		
		//use explicitwait with condition
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dashbordLocator)));
		
		
		
		driver.close();
		driver.quit();
		
		
		
		
	}

}
