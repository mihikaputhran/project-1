package Seleniumpacket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Basic_script {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "//Users//pinkypunjabi//Documents//chorm driver//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		
		String title;
		
		// get the browser title and print
		title = driver.getTitle();
		
		System.out.println(title);
		
		//get current url
		String url = driver.getCurrentUrl();
		//System.out.println(driver.getCurrentUrl());
		System.out.println(url);
		
		//maximise browser
		
		driver.manage().window().maximize();
		
		//get the page source
		
		String source = driver.getPageSource();
		System.out.println(source);
		
		//driver.quit();
		//driver.close();
	}

}
