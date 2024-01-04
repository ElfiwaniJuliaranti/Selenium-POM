package stepDef;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.time.Duration;

import static pages.LoginPage.*;

public class loginStep extends BrowserDriver {

    @Given("User is on login page")
    public void userIsOnLoginPage() {
        driver.get(baseUrl);
        Duration duration = Duration.ofSeconds(100);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit'][@data-test='login-button']"))
        );
    }

    @When("^User fill username and password$")
    public void userFillUsernameAndPassword() {
        inputData("standard_user", "secret_sauce");
    }

    @And("User click login button")
    public void userClickLoginButton() {
        click_login_btn();
    }

    @Then("User navigate to homepage")
    public void userNavigateToHomepage() {
        Duration duration = Duration.ofSeconds(100);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='title'][contains(text(),'Products')]"))
        );
    }
}
