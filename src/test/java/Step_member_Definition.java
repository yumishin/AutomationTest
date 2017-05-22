import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Step_member_Definition {

    @When("^user put the id\"(.*)\"$")
    //로그인페이지>ID 입력
    public void email(String text) {
        ChromeDriver driver = StepDefinition.driver;

        driver.findElement(By.id("email")).sendKeys(text, Keys.TAB);
    }

    @When("^user put the pw \"(.*)\"$")
    //Login page > Input PW > Enter> Main validation check
    public void password(String text) {
        ChromeDriver driver = StepDefinition.driver;

        driver.findElement(By.id("password")).sendKeys(text);
        driver.findElement(By.className("login-form-submit")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

}
