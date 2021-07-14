import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

/**
 * @author Manjunath Prabhakar (Manjunath-PC)
 * @created 14/07/2021
 * @project playwright-demo
 */
@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber-reports/output.json"},
        dryRun = false,
        monochrome = false
)
public class RunTest extends AbstractTestNGCucumberTests {
  
}
