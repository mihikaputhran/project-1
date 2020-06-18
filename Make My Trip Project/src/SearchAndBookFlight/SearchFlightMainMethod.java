package SearchAndBookFlight;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchFlightMainMethod {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//pinkypunjabi//Documents//chorm driver//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		//Navigate to the website
		driver.navigate().to("https://www.makemytrip.com/?ccde=us");
		
		//Create Object of the SearchFlightPage class
		SearchFlightPage SearchFlight = new SearchFlightPage(driver);
		
		//Perform Search Action
		SearchFlight.SelectRoundTrip().click();
		
		Thread.sleep(4000L);
		
		SearchFlight.SelectFrom().click();
		
		Thread.sleep(4000L);
		
		SearchFlight.SelectFrom().sendKeys("Delhi");
		
		Thread.sleep(4000L);
		
		SearchFlight.SelectFromDelhi().click();
		
		Thread.sleep(4000L);
		
		SearchFlight.SelectTo().click();
		
		Thread.sleep(4000L);
		
		SearchFlight.SelectTo().sendKeys("Mumbai");
		
		Thread.sleep(4000L);
		
		SearchFlight.SelectToAsMumbai().click();
		
		Thread.sleep(4000L);
		
		SearchFlight.ClickDepartureDate().click();
		
		Thread.sleep(4000L);
		
		SearchFlight.SelectDepartureDate().click();
		
		Thread.sleep(4000L);
		
		SearchFlight.ClickReturnDate().click();
		
		Thread.sleep(4000L);
		
		SearchFlight.SelectReturnDate().click();
		
		Thread.sleep(4000L);
		
		SearchFlight.SelectTravellersAndClass().click();
		
		Thread.sleep(4000L);
		
		SearchFlight.SelectNoOfAdult().click();
		
		Thread.sleep(4000L);
		
		SearchFlight.SelectNoOfChildren().click();
		
		Thread.sleep(4000L);
		
		SearchFlight.SelectNoOfInfant().click();
		
		Thread.sleep(4000L);
		
		SearchFlight.SelectPremiumClass().click();
		
		Thread.sleep(4000L);
		
		SearchFlight.ClickApplyButton().click();
		
		Thread.sleep(4000L);
		
		SearchFlight.ClickSearchButton().click();
	}

}
