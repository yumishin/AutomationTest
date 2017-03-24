import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Step_display_Definition {

    ChromeDriver driver = new ChromeDriver();

    @When("^user goes 1st timesale page$")
    //메인>첫번째 구좌 한정특가 클릭
    public void clickTotimesalepage() {
        driver.findElement(By.id("dealArea")).findElement(By.tagName("img")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @When("^user click to delivery$")
    //딜상세>배송/교환/반품정보 클릭
    public void clickToDelivery() {
        driver.findElement(By.id("delivery")).click();
    }


    @Then("^product detail page contains \"(.*)\" in the \"(.*)\" area$")
    //딜상세페이지 벨리데이션 체크
    public void verifyProductDetails(String text, String area) {
        Boolean check = driver.findElement(By.id(area)).getText().contains(text);
        Assert.assertTrue(check);
    }



}
