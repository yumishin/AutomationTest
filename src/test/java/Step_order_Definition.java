import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Step_order_Definition {

    @When("^user click the cart\"(.*)\"$")
    //장바구니 버튼 클릭
    public void cart(String text) {
        ChromeDriver driver = StepDefinition.driver;
        driver.findElement(By.className("goods-view-form-footer")).click();
    }


}