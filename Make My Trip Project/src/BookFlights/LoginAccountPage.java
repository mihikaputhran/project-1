package BookFlights;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAccountPage {
	
	WebDriver Driver;
	

    //contractor method receiving the driver from the script and setting into WebDriver driver"
	
	public LoginAccountPage(WebDriver methoddriver) 
	{
		this.Driver = methoddriver;
		PageFactory.initElements(Driver, this);
		
	}
	
	//Object Repository
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(xpath="//body//section//p//span[1]")
	WebElement LoginWindow;
	
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div[2]/div[2]/div[2]/section/form/div[2]/button/span")
	WebElement ContinueButton;
	
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="//div[@id='SW']//div//div//div//section//form")
	WebElement LoginButton;
	
	
	//Create Method for repository input or action
	
	public WebElement UserName() throws InterruptedException {
		Thread.sleep(2000L);
		return username;
	}

	
	public WebElement ContinueButton()  {
		
		return ContinueButton;
	}
	
	
	public WebElement Password() throws InterruptedException {
		Thread.sleep(2000L);
		return Password;
	}
	
	
	public WebElement LoginButton() throws InterruptedException {
		Thread.sleep(2000L);
		return LoginButton;
	}
}
