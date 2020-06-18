package AmazonCumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchClass {

	 @Given("^User Enters amazon.com$")
	    public void user_enters_amazoncom() throws Throwable {
	        //throw new PendingException();
		 System.out.println("Enter amazon website to search a product");
	    }

	    @When("^user click search button$")
	    public void user_click_search_button() throws Throwable {
	        //throw new PendingException();
	    	 System.out.println("Click search button");
	    }

	    @Then("^Products matching to the search creteria should be displayed.$")
	    public void products_matching_to_the_search_creteria_should_be_displayed() throws Throwable {
	        //throw new PendingException();
	    	 System.out.println("All the products matching search creteria should be displayed");
	    }

	 
	
}
