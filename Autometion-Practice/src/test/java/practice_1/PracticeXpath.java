package practice_1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeXpath {

	@Test

	public void Addcontact() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.priceline.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[contains(text(),'HOTELS')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'FLIGHTS')]")).click();
		driver.findElement(By.cssSelector("span[id='myTrips-nav-title']")).click();
		

		
		
//		driver.close();
//		driver.quit();

	}

}
