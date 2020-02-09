package run_Java_For_Autometion_Chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inspect_Elements {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		/*driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("This is my first code");
		driver.findElement(By.name("pass")).sendKeys("Password Test");
		driver.findElement(By.linkText("Forgot account?")).click();*/
		
		driver.get("https://www.salesforce.com");
		
		

	}

}
