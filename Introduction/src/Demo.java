import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		//selenium code
		
		//create driver object
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());

	}

}
