package practice_1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddContactTest {

	@Test

	public void Addcontact() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://techfios.com/test/billing/?ng=admin/");

		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		Thread.sleep(6000);

		driver.findElement(By.name("password")).sendKeys("abc123");

		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//*[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Add Contact')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("account")).sendKeys("Kausik Roy");
		Thread.sleep(3000);

		driver.findElement(By.id("company")).sendKeys("Chop house gyro");

		driver.findElement(By.id("email")).sendKeys("rkausik74@gmail.com");

		driver.findElement(By.id("phone")).sendKeys("917-573-4982");

		driver.findElement(By.id("address")).sendKeys("1504 mountainside drive");

		driver.findElement(By.id("state")).sendKeys("Texas");

		driver.findElement(By.id("zip")).sendKeys("75002");

		driver.findElement(By.id("submit")).click();

		Thread.sleep(5000);
		driver.close();
		driver.quit();

	}

}
