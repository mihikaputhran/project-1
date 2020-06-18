package BookFlights;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	
	WebDriver Driver;
	
	   //contractor method receiving the driver from the script and setting into WebDriver driver" 
	public HomePage(WebDriver methoddriver) 
	{
		
		this.Driver = methoddriver;
		PageFactory.initElements(methoddriver, this);
	
	}
	
	
	 //creating object repository 
	@FindBy(xpath="/html/body/div/div/div[1]/div[2]/div[1]/ul/li[3]/div/p")
	WebElement Signin_Homepage;
	
	
	//Method to return signin button element
	public WebElement SigninButton() throws InterruptedException 
	{
		Thread.sleep(2000L);
		return Signin_Homepage;
		
	}
}
