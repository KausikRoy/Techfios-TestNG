package run_Java_For_Autometion_Chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Run_Autometion_IE {

	public static void main(String[] args) {
		
		//nothing is changing except the chrome driver to IE
		
		System.setProperty("webdriver.ie.driver", ".\\driver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.priceline.com/");
		System.out.println(driver.getPageSource());
		
		

	}

}
