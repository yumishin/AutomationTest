
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Step_search_Definition {

    ChromeDriver driver = new ChromeDriver();

    @When("^user search \"(.*)\"$")
    //메인>검색어입력후 클릭
    public void search(String text) {
        driver.findElement(By.id("search")).sendKeys(text);
        driver.findElement(By.id("searchForm")).findElement(By.tagName("button")).click();
    }

    @Then("^search result page contains \"(.*)\"$")
    //검색결과 페이지확인
    public void verifyResultSearch(String text) {
        Boolean check = driver.findElement(By.className("resultView")).getText().contains(text);
        Assert.assertTrue(check);
    }

    @When("^user goes product detail page$")
    //검색결과>첫번째 상품 클릭
    public void clickProductDetails() {
        driver.findElement(By.id("dealArea")).findElement(By.tagName("img")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

}
