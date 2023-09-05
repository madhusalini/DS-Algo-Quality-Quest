package testRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(
		features = {"src/test/resources/features"},
		glue = {"stepDefinitions","appHooks"},
		plugin = {"pretty", 
				"html:target/cucumber-reports",//Cucumber Report			
		}
		
		)
public class MyTestRunner extends AbstractTestNGCucumberTests {
	 @DataProvider(parallel = true)
	    @Override
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
}

