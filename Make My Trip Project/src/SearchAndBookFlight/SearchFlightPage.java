package SearchAndBookFlight;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFlightPage {
	WebDriver Driver;
	
	public SearchFlightPage(WebDriver SearchDriver)
	{
		this.Driver = SearchDriver;
		PageFactory.initElements(Driver, this);
	}

	//Object Repository
	
	@FindBy(xpath="//body/div[@id='root']/div/div/div/div/div/ul/li[2]")
	WebElement SelectRoundTrip;
	
	@FindBy(id="fromCity")
	WebElement SelectFrom;
	
	@FindBy(xpath=" //input[@placeholder='From']")
	WebElement EnterFrom;
	
	@FindBy(xpath=" //p[contains(text(),'Delhi, India')]")
	WebElement SelectFromDelhi;
	
	@FindBy(id="toCity")
	WebElement SelectTo;
	
	@FindBy(xpath="  //input[@placeholder='To']")
	WebElement EnterTo;
	
	@FindBy(xpath="//p[contains(text(),'Mumbai, India')]")
	WebElement SelectToAsMumbai;
	
	@FindBy(xpath=" //body/div[@id='root']/div/div/div/div/div/div/div[3]/label[1]/span[1]")
	WebElement ClickDepartureDate;
	
	@FindBy(xpath="//body//div[@id='root']//div//div//div//div//div//div//div//div//div//div//div//div//div//div[1]//div[3]//div[4]//div[4]//div[1]//p[1]")
	WebElement SelectDepartureDate;
	
	@FindBy(xpath=" //body/div[@id='root']/div/div/div/div/div/div/div[4]/label[1]/span[1]")
	WebElement ClickReturnDate;
	
	@FindBy(xpath="//body//div[@id='root']//div//div//div//div//div//div//div//div//div//div//div//div//div//div[1]//div[3]//div[4]//div[7]//div[1]//p[1]")
	WebElement SelectReturnDate;
	
	@FindBy(xpath=" //div[5]//label[1]")
	WebElement SelectTravellersAndClass;
	
	@FindBy(xpath="//body/div[@id='root']/div/div/div/div/div/div/div/div/div/ul[1]/li[2]")
	WebElement SelectNoOfAdult;
	
	@FindBy(xpath="//body//div[@id='root']//div//div//div//div//div//div//div//div//div//div//div[1]//li[2]")
	WebElement SelectNoOfChildren;
	
	@FindBy(xpath="//body//div[@id='root']//div//div//div//div//div//div//div[2]//ul[1]//li[2]")
	WebElement SelectNoOfInfant;
	
	@FindBy(xpath="//body//div[@id='root']//div//div//div//div//ul[2]//li[2]")
	WebElement SelectPremiumClass;
	
	@FindBy(xpath="//button[contains(@class,'primaryBtn btnApply pushRight')]")
	WebElement ClickApplyButton;
	
	@FindBy(xpath="//a[contains(@class,'primaryBtn font24 latoBold widgetSearchBtn')]")
	WebElement ClickSearchButton;
	
	
	//Create class of every object
	
public WebElement SelectRoundTrip()  {
		
		return SelectRoundTrip;
	}
	
public WebElement SelectFrom()  {
	
	return SelectFrom;
}

public WebElement EnterFrom()  {
	
	return EnterFrom;
}

public WebElement SelectFromDelhi()  {
	
	return SelectFromDelhi;
}

public WebElement SelectTo()  {
	
	return SelectTo;
}

public WebElement EnterTo()  {
	
	return EnterTo;
}


public WebElement SelectToAsMumbai()  {
	
	return SelectToAsMumbai;
}

public WebElement ClickDepartureDate()  {
	
	return ClickDepartureDate;
}

public WebElement SelectDepartureDate()  {
	
	return SelectDepartureDate;
}

public WebElement ClickReturnDate()  {
	
	return ClickReturnDate;
}

public WebElement SelectReturnDate()  {
	
	return SelectReturnDate;
}


public WebElement SelectTravellersAndClass()  {
	
	return SelectTravellersAndClass;
}

public WebElement SelectNoOfAdult()  {
	
	return SelectNoOfAdult;
}

public WebElement SelectNoOfChildren()  {
	
	return SelectNoOfChildren;
}

public WebElement SelectNoOfInfant()  {
	
	return SelectNoOfInfant;
}

public WebElement SelectPremiumClass()  {
	
	return SelectPremiumClass;
}

public WebElement ClickApplyButton()  {
	
	return ClickApplyButton;
}

public WebElement ClickSearchButton()  {
	
	return ClickSearchButton;
}
	
}
