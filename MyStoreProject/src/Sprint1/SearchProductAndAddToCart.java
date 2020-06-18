package Sprint1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchProductAndAddToCart {
	
	public static void SearchProduct() throws InterruptedException {
		
		LoginToAccount Login = new LoginToAccount();
		Login.LoginAccount();
		
		WebDriver driver = new ChromeDriver();
		
		//Click on Home button to go on home page to search a product
		driver.findElement(By.className("btn btn-default button button-small")).click();
		
		Thread.sleep(2000);
		
		//Enter Product in the search text box.
		driver.findElement(By.id("search_query_top")).sendKeys("Printed");
		
		//Click Search button.
		driver.findElement(By.id("btn btn-default button-search")).click();
		
		//If your product is displayed below, test if the quantity should be auto filled as one.
		String DisplayedQty = driver.findElement(By.className("text")).getText();
		
		if (DisplayedQty == "1") {
			
			System.out.println("Quantiy is 1, test passed");
			
		}
		
		else
		{
			System.out.println("test failed");
			
		}
		
		//Click on Add to cart button
		driver.findElement(By.className("exclusive")).click();
		
		//Click proceed to checkout button 
		driver.findElement(By.className("btn btn-default button button-medium")).click();
		
		//Increase the quantity by clicking + sign 
		driver.findElement(By.className("icon-plus")).click();
		
		Thread.sleep(2000);
		
		//Check if quantity has increased
		if (DisplayedQty == "2") {
			
			System.out.println("Quantity increased is correct- test passed");
		
		}
		
		else 
		{
			System.out.println("Quantity is incorrect - test failed");
		}
		
		/*Check if the price has increased as per quantity
		Float ActualPrice = driver.findElement(By.className("price")).getText();
		Float UnitPrice = driver.findElement(By.id("product_price_7_34_317752")).getText();
		
		Float ActualPriceInt = ActualPrice;
		Float UnitPriceInt = UnitPrice;
		
		if {ActualPrice == */
	}

}
