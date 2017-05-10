import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Step_member_Definition {

    @When("^user put the id and pw \"(.*)\"$")
    //로그인페이지>ID,PW 입력
    public void email(String text) {
        ChromeDriver driver = StepDefinition.driver;

        driver.findElement(By.id("email")).sendKeys(text);
        driver.findElement(By.id("password")).sendKeys(text);
        driver.findElement(By.id("loginButton")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

}
