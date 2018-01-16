package CucumberProj.CucumberProjstepImpementation;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ThirdImplementation {

	@Given("^there are (\\d+)$")
	public void there_are(int arg1) throws Throwable {
	     System.out.println("Value is getting printed"+ arg1);
	}

	@When("^I eat (\\d+)$")
	public void i_eat(int arg1) throws Throwable {
	     System.out.println("Value is getting printed"+ arg1);
	 	
	}

	@Then("^I should have (\\d+)$")
	public void i_should_have(int arg1) throws Throwable {
	     System.out.println("Value is getting printed"+ arg1);
	 	
	}
}
