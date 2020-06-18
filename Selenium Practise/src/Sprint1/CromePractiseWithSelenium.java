package Sprint1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CromePractiseWithSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "//Users//pinkypunjabi//Documents//chorm driver//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		//Navigate to Google
		
		driver.navigate().to("https://www.google.com/");
		
		//Display Title with if condition
		String Title = driver.getTitle();
		System.out.println(Title);
		
		if (Title =="Its Google")
		{
			System.out.println("This is a wrong title");
			
		}
		
		else
		{
			System.out.println("This is a right title");
		}
		
		//Display URL 
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		//Maximise Window
		driver.manage().window().maximize();
		
		
		//Close the window
		driver.close();
		
		
		

	}

}
