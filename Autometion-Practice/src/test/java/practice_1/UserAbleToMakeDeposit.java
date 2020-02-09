package practice_1;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class UserAbleToMakeDeposit {
	
@Test	
	
	public void userCanMakeDeposit() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );

		driver.get("http://techfios.com/test/billing/?ng=admin/");

		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.name("password")).sendKeys("abc123");

		driver.findElement(By.name("login")).click();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Transactions')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Add Deposit')]")).click();
		driver.findElement(By.id("select2-account-container")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='SHAJU']")).click();
		driver.findElement(By.xpath("//*[@name='description']")).sendKeys("My Test payment");
		driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("1500");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		String depositValidater = "//a[contains(text(),'My Test payment')]";
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(depositValidater)));
		
		String expectedText = "My Test payment";
		//purposely put the wrong xpath to fail the autometion
		String actualText = driver.findElement(By.xpath("//a[contains(text(),'My Test payment')]")).getText();
		
		
		Assert.assertEquals("Deposite did not display!", expectedText, actualText);
		
		//driver.close();
		//driver.quit();
		
	}

}
