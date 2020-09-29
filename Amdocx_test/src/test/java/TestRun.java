import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		
		features = "C:\\Users\\gnsan\\eclipse-workspace\\Amdocx_test\\src\\test\\java\\featurefile\\AmdocxTest.feature",
				glue = "Stepdef",
		
		plugin = {"pretty" ,"json:target//cucumber.json"}
		
		
		)
public class TestRun extends AbstractTestNGCucumberTests {

}
