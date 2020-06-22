package packone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*import org.openqa.selenium.firefox.FirefoxDriver;*/

public class FirstClass {

	
	public static void main(String[] args) {
		
		/*WebDriver driver = new FirefoxDriver();
		driver.get("http:/facebook.com");
		driver.manage().window().maximize();
		driver.close();*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\52094750\\Desktop\\WD\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("http:/facebook.com");
		driver1.manage().window().maximize();
		driver1.close();	
		
		
	}
}
