import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Step_member_Definition {

    @When("^user put the id\"(.*)\"$")
    //Login page > Input ID
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

    //SNS SignUp > Naver
    @When("^user click to SignUp page$")


    public void clickToSignUp() {
        ChromeDriver driver = StepDefinition.driver;
        driver.findElement(By.className("navi")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.className("member-SNS-naver")).click();
    }

}
