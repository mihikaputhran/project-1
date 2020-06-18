package Sprint1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToTheWebsite {
	
	public static void NavigateWebsite() {
	
	System.setProperty("webdriver.chrome.driver", "//Users//pinkypunjabi//Documents//chorm driver//chromedriver");
	
	
	WebDriver driver = new ChromeDriver();
	
	//Navigate to the website.
	driver.navigate().to("https://www.amazon.com/");
	
	}

}
