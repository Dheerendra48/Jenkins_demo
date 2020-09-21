package Runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions ( features = {"C:\\DKS\\Workbook\\pom\\src\\test\\resources\\Login\\login.feature"},
	glue={"StepDefinition"},
	dryRun=false,//To check weather you have missed an steps in the scenarion
	monochrome=true,//to make the console output in a better format
	strict = true//it will check wether any step is not defined in step definition
	

	)
public class Test_runner {

}
