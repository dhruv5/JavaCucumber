package CucumberProj.CucumberProjstepImpementation;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepImplementation {


	@Before
	public void setup() throws Throwable {
		   System.out.println("set up");
		}

	
	@Given("^start the app$")
	public void start_the_app() throws Throwable {
	   System.out.println("GIVEN COndition");
	}

	@Then("^login to app$")
	public void login_to_app() throws Throwable {
	
		   System.out.println("Then COndition");
			
	}

	@When("^Shut down the app$")
	public void shut_down_the_app() throws Throwable {
	
		   System.out.println("When COndition");
			
	}
	 @After public void cleanUp(){ 
	    System.out.println("End Condition"); 
	 } 
}
