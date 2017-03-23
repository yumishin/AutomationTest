import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Step_order_Definition {

    ChromeDriver driver = new ChromeDriver();

    @Given("^user open URL \"(.*)\"$")
    public void openChrome(String url) {
        driver.get(url);
    }

    @When("^user click to login page$")
    public void clickToLogin() {
        driver.findElement(By.className("loginBtn")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    @When("^user put the id and pw \"(.*)\"$")
    public void email(String text) {
        driver.findElement(By.id("email")).sendKeys(text);
        driver.findElement(By.id("password")).sendKeys(text);
        driver.findElement(By.id("loginButton")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @When("^user goes todayNewlist$")
    public void clickMainTodayNewList() {
        driver.findElement(By.id("todayNewList")).findElement(By.tagName("img")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @After
    public void close() {
        driver.close();
    }

}
