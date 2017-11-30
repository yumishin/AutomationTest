import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Step_member_Definition {

    @When("^login_user put the id\"(.*)\"$")
    //로그인페이지>ID 입력
    public void email(String text) {
        ChromeDriver driver = StepDefinition.driver;
        driver.findElement(By.xpath("//input[@name='m_id']")).sendKeys(text, Keys.TAB);
    }

    @When("^login_user put the pw \"(.*)\"$")
    //Login page > Input PW > Enter> Main validation check
    public void password(String text) {
        ChromeDriver driver = StepDefinition.driver;
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(text);
        driver.findElement(By.xpath("//input[@value='로그인']")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @When("^sign up_user click the sign up$")
    //Login page > Input PW > Enter> Main validation check
    public void clickSignUp() {
        ChromeDriver driver = StepDefinition.driver;
        driver.findElement(By.linkText("회원가입")).click();
        //driver.findElement(By.xpath("//a[@href='/m2/mem/join.php']")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @When("^sign up_input id \"(.*)\"$")
    //sign-up page > input id
    public void InputID(String text) {
        ChromeDriver driver = StepDefinition.driver;
        driver.findElement(By.name("m_id")).sendKeys(text);

    }

    @When("^sign up_click id check$")
    //sign-up page > id check button click
    public void InputIDCheckClick() {
        ChromeDriver driver = StepDefinition.driver;
        driver.findElement(By.className("field_id")).findElement(By.tagName("button")).click();
        //driver.findElement(By.xpath(".//*[@id='form']/div[1]/div[1]/div[2]/button")).click();
        //findElement(By.xpath("//button[contains(@onclick,'idCheck('[name=m_id]')]"))
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @When("^sign up_input password \"(.*)\"$")
    //sign-up page > input password
    public void InputPassword(String text) {
        ChromeDriver driver = StepDefinition.driver;
        driver.findElement(By.name("password")).sendKeys(text);

    }

    @When("^sign up_input password2 \"(.*)\"$")
    //sign-up page > input password2
    public void InputPassword2(String text) {
        ChromeDriver driver = StepDefinition.driver;
        driver.findElement(By.name("password2")).sendKeys(text);

    }

    @When("^sign up_input name \"(.*)\"$")
    //sign-up page > input name
    public void InputName(String text) {
        ChromeDriver driver = StepDefinition.driver;
        driver.findElement(By.name("name")).sendKeys(text);

    }

    @When("^sign up_input email \"(.*)\"$")
    //sign-up page > input email
    public void InputEmail(String text) {
        ChromeDriver driver = StepDefinition.driver;
        driver.findElement(By.name("email")).sendKeys(text);

    }

    @When("^sign up_input phoneNumber1 \"(.*) (.*) (.*)\"$")
    //sign-up page > input phone number1
    public void InputPhoneNumber1(String part1, String part2, String part3) {
        ChromeDriver driver = StepDefinition.driver;
        driver.findElement(By.className("field_phone")).findElement(By.className("phone_fst")).sendKeys(part1);
        driver.findElement(By.className("field_phone")).findElement(By.className("phone_snd")).sendKeys(part2);
        driver.findElement(By.className("field_phone")).findElement(By.className("phone_trd")).sendKeys(part3);
        //driver.findElement(By.xpath(".//*[@id='form']/div[1]/div[6]/div[2]/div/input[1]")).sendKeys(text);
        //findElement(By.tagName("styled-form-input phone_fst"))

    }

    @When("^sign up_click to get phoneNumber confirm$")
    //sign-up page > click to get phone number confirm
    public void ClicktoGetPhoneNumConfirm() {
        ChromeDriver driver = StepDefinition.driver;
        driver.findElement(By.id("btn_cert")).click();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @When("^sign up_input phoneNumber confirm \"(.*)\"$")
    //sign-up page > click to phone number confirm
    public void inputPhoneNumConfirm(String text) {
        ChromeDriver driver = StepDefinition.driver;
        driver.findElement(By.name("auth_code")).sendKeys(text);
        //.//*[@id='form']/div[1]/div[6]/div[3]/div/input/div/input

    }


    @Then("^sign up_page contains verify \"(.*)\"$")
    //회원가입 페이지 상단의 "회원가입" text로 verify 체크
    public void verifySignUp(String text) {
        ChromeDriver driver = StepDefinition.driver;
        Boolean check = driver.findElement(By.className("layout-page-header-title-wrapper")).getText().contains(text);
        Assert.assertTrue(check);
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
        driver.findElement(By.className("btn_close")).click();
        //driver.findElement(By.xpath("//div[@id='popPassword']/div/div/a")).click();
        //<a href="/shop/member/indb.notice_change_pwd.php" target="ifrmHidden" class="btn btn_close">다음에하기</a>
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


}
