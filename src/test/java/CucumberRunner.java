import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format={"pretty","html:reports/test-report"},tags= "@smokeTest", features = {
        "src/test/resources/member.feature"})
        //"src/test/resources/productDetails.feature"})
public class CucumberRunner {
}
