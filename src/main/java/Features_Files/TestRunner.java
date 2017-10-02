package Features_Files;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\src\\main\\java\\Features_Files\\Features.feature",glue={"Features_Files"},tags={"@Tag2"})
public class TestRunner 
{





}
