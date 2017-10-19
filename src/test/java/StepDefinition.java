import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class StepDefinition {

    public static ChromeDriver driver;

    @Given("^user open URL \"(.*)\"$")
    public void openChrome(String url) {
        driver = new ChromeDriver();
        driver.get(url);
    }


    @When("^user click to login page$")
    //메인>로그인버튼 클릭
    public void clickToLogin() {
        driver.findElement(By.xpath("//a[contains(.,'마이컬리')]")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }



    @Then("^login result page contains \"(.*)\"$")
    //메인>로그인결과 확인
    public void verifyResultLogin(String text) {
        List<WebElement> webElement = driver.findElements(By.className("loginBtn"));


        System.out.print(webElement);

        //By.className("navi loginBtn")).findElement((By.linkText("로그아웃"));



        //Assert.assertTrue(check);
    }


    @After
    public void close() {
        driver.close();
    }

}
