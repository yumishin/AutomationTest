import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import org.openqa.selenium.chrome.ChromeDriver;


public class Step_search_Definition {

    ChromeDriver driver = new ChromeDriver();

    @Given("^user open URL \"(.*)\"$")
    public void openChrome(String url) {
        driver.get(url);
    }




    @After
    public void close() {
        driver.close();
    }

}
