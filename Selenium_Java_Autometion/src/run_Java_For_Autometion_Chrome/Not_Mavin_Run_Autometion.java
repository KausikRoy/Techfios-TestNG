package run_Java_For_Autometion_Chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Not_Mavin_Run_Autometion {

	public static void main(String[] args) {
		// Formula to create path for Chromedriver
		//Download selenium jar and create a reference Library through build a path
		//download chromedriver path and create driver folder
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle()); //
		
		System.out.println(driver.getCurrentUrl()); //this is to validate if your on correct URL
		
		//System.out.println(driver.getPageSource());
		driver.get("https://www.yahoo.com/");// going to a different URL
		driver.navigate().back();// to get back to the previous page
		//driver.navigate().forward();
		driver.close();

		

	}

}
