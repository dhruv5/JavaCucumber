package CucumberProj.CucumberProjstepImpementation;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class implementation2 {

	@Given("^start$")
	public void start() throws Throwable {
	
	    System.out.println("GIVEN");
		
	}

	@Then("^login$")
	public void login() throws Throwable {
	
	    System.out.println("THEN");
		
	}

	@When("^Shut$")
	public void shut() throws Throwable {
	    System.out.println("WHEN");
	}
}
