import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class StepDefinition {

    ChromeDriver driver = new ChromeDriver();

    @Given("^user open URL \"(.*)\"$")
    public void openChrome(String url) {
        driver.get(url);
    }


    @When("^user click to login page$")
    //메인>로그인버튼 클릭
    public void clickToLogin() {
        driver.findElement(By.className("loginBtn")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    @When("^user put the id and pw \"(.*)\"$")
    //로그인페이지>ID,PW 입력
    public void email(String text) {
        driver.findElement(By.id("email")).sendKeys(text);
        driver.findElement(By.id("password")).sendKeys(text);
        driver.findElement(By.id("loginButton")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    @Then("^login result page contains \"(.*)\"$")
    //메인>로그인결과 확인
    public void verifyResultLogin(String text) {
        Boolean check = driver.findElement(By.className("loginBnt")).findElement(By.linkText("로그아웃")).getText().contains(text);
        Assert.assertTrue(check);
    }


    @After
    public void close() {
        driver.close();
    }

}
