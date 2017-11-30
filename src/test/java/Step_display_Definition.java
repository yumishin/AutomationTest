import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Step_display_Definition {


    @When("^user goes main popular-goods page$")
    //메인>인기상품 가운데 상품 클릭
    public void clickTopopulargoodsPage() {
        ChromeDriver driver = StepDefinition.driver;
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@id='popular-goods-wrapper']/ul/li[5]/a")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @When("^user click to delivery$")
    //딜상세>배송/교환/반품정보 클릭
    public void clickToDelivery() {
        ChromeDriver driver = StepDefinition.driver;
        driver.findElement(By.id("delivery")).click();
    }


    @Then("^product detail page contains \"(.*)\" in the \"(.*)\" area$")
    //상품 상세페이지> 메인이미지 벨리데이션 체크 (img src = img-cf.kurly.com으로 시작하는 경로가 있는가/ 리퀘스트값이 200 ok인가
    public void verifyProductDetails(String text, String area) {
        ChromeDriver driver = StepDefinition.driver;
        //Boolean check = driver.findElement(By.id(area)).getText().contains(text);
        Boolean check = driver.findElement(By.className("goods-view-figure")).getTagName().contains(text);
        Assert.assertTrue(check);
    }

    //메인배너 전체 이미지 200 ok check
    @When("^user click the main rolling banners$")
    //Login page > Input PW > Enter> Main validation check
    public void valifyToMainRollingBannersAll() {
        ChromeDriver driver = StepDefinition.driver;
        List<WebElement> images = driver.findElement(By.id("today-banner")).findElements(By.tagName("img"));

//        images.get(0).click();
//        images.get(1).click();
//        images.get(2).click();

        for (WebElement image : images) {
            String imageSrc = image.getAttribute("src");
            if (imageSrc == null) imageSrc = image.getAttribute("data-src").replace("//", "http://");
            checkUrl(imageSrc);
        }
    }

    public void checkUrl(String src) {
        try {
            URL url = new URL(src);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            int status = con.getResponseCode();
            Assert.assertTrue(status == 200);
        } catch (Exception ex) {
            Assert.fail(ex.toString());
        }


    }
}
