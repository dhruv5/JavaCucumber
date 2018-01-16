package CucumberProj.CucumberProj;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
// feature: Folder location 
// glue : Package name.
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features/FirstFeature.feature"
		,glue="CucumberProj.CucumberProjstepImpementation",
		format = {"json:target/cucumber.json", "html:target/Destination/cucumber-pretty"}
		)
 
public class TestRunner {

}
	