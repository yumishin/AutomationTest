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

    @When("^user search \"(.*)\"$")
    public void search(String text) {
        driver.findElement(By.id("search")).sendKeys(text);
        driver.findElement(By.id("searchForm")).findElement(By.tagName("button")).click();
    }

    @Then("^search result page contains \"(.*)\"$")
    public void verifyResultSearch(String text) {
        Boolean check = driver.findElement(By.className("resultView")).getText().contains(text);
        Assert.assertTrue(check);
    }

    @When("^user goes product detail page$")
    public void clickProductDetails() {
        driver.findElement(By.id("dealArea")).findElement(By.tagName("img")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    @When("^user click to delivery$")
    public void clickToDelivery() {
        driver.findElement(By.id("delivery")).click();
    }

    @Then("^product detail page contains \"(.*)\" in the \"(.*)\" area$")
    public void verifyProductDetails(String text, String area) {
        Boolean check = driver.findElement(By.id(area)).getText().contains(text);
        Assert.assertTrue(check);
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


    @Then("^login result page contains \"(.*)\"$")
    public void verifyResultLogin(String text) {
        Boolean check = driver.findElement(By.className("loginBnt")).findElement(By.linkText("로그아웃")).getText().contains(text);
        Assert.assertTrue(check);
    }


    @After
    public void close() {
        driver.close();
    }

}
