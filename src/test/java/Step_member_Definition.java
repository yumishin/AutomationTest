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
        driver.findElement(By.xpath("//input[@name='m_id']")).sendKeys(text, Keys.TAB);
    }

    @When("^user put the pw \"(.*)\"$")
    //Login page > Input PW > Enter> Main validation check
    public void password(String text) {
        ChromeDriver driver = StepDefinition.driver;
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(text);
        driver.findElement(By.xpath("//input[@value='로그인']")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @When("^user click the sign up \"(.*)\"$")
    //Login page > Input PW > Enter> Main validation check
    public void clickSignUp(String text) {
        ChromeDriver driver = StepDefinition.driver;
        driver.findElement(By.xpath("//a[@href='/m2/mem/join.php']")).click();
        //<a href="/m2/mem/join.php" class="member-login-anchor-button wide">회원가입</a>
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @When("^user click to logout \"(.*)\"$")
    //Login page > Input PW > Enter> Main validation check
    public void clickLogout(String text) {
        ChromeDriver driver = StepDefinition.driver;
        driver.findElement(By.className("bnt_logout")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @When("^user click to change the pwd in main pop-up \"(.*)\"$")
    //Login page > Input PW > Enter> Main validation check
    public void mainpopup_change_PWD(String text) {
        ChromeDriver driver = StepDefinition.driver;
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.className("bnt_group")));
        driver.findElement(By.className("btn btn_close")).click();
        //driver.findElement(By.xpath("//div[@id='popPassword']/div/div/a")).click();
        //<a href="/shop/member/indb.notice_change_pwd.php" target="ifrmHidden" class="btn btn_close">다음에하기</a>
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }



}
