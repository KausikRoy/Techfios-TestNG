package run_Java_For_Autometion_Chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sales_Force_Site {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		
		driver.get("https://login.salesforce.com/");
		
		
		driver.findElement(By.id("Username")).sendKeys("KausikRoy");
		
		driver.findElement(By.name("pw")).sendKeys("123456");
	}

}
