package Sprint1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class LoginToAccount  {
	
	public static void LoginAccount() throws InterruptedException {
	

		
		NavigateToTheWebsite Navigate = new NavigateToTheWebsite();
			
		Navigate.NavigateWebsite();
		
		WebDriver driver = new ChromeDriver();
		
		//Enter already registered details - registered valid email id
		driver.findElement(By.id("email")).sendKeys("kia@gmail.com");
		
		//Enter password
		driver.findElement(By.id("passwd")).sendKeys("kia1234");
		
		//Click Submit Button
		driver.findElement(By.id("SubmitLogin")).click();
		
		Thread.sleep(2000);
		
		/*User should be navigated to my account page, test if the page is correct.
		String ActualUrl = driver.getCurrentUrl();
		String ExpectedUrl = "http://automationpractice.com/index.php?controller=my-account";
		System.out.println("ActualUrl");
		
		//Check if actual and expected page is same.
		if (ActualUrl == ExpectedUrl) {
			
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}*/
			
	
		
	}

}
