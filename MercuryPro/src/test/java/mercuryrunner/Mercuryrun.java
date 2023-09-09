package mercuryrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(features= "Mercuryfeature" , glue= {"mercurystep"} , plugin= {"pretty","html:target/htmlreports"})


public class Mercuryrun {

	
}

