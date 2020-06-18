package AmazonCumber;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginClass {
	
	//Positive login test
	  @Given ("^User enters amazon.com$")
	  public void User_Enter_AmazonCom_Website(){
		  System.out.println("Enter Amazon website");
	  }
	  
	  @When ("^User enters vaild user name and password$")
	  public void User_Enters_Valid_UserNameAndPassword() {
		  
		  System.out.println("Enter Username and password");
	  }
	  
	  @Then ("^User should land on homepage$")
	  public void User_Should_Land_OnHomepage() {
		  
		  System.out.println("User should land to homepage");
		  
	  }
	
	  //Negative login test
	  
	    @Given ("^User enters amazon.com$")
	    public void User_Enters_amazonwebite() {
	    	
	  	  System.out.println("User should land to homepage for negative test");
	    }
	    
	    
	    @When ("^User enters invaild User name and leaves the password empty$")
	    public void User_Enters_invalid_userId_and_clicksContinueButton() {
	    	
	  	  System.out.println("User entered invalid userid and clicked continue button");
	    }
	    @Then ("^Error message should be displayed informing user the user name is invalid$")
	    public void Errror_Message_shouldbe_Displayed() {
	    	
	  	  System.out.println("Error message was displayed");
	    	
	    }


}
