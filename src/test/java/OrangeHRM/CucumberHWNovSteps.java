package OrangeHRM;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import java.time.Duration;


public class CucumberHWNovSteps {
    private WebDriver driver;

    @Given("the user access the webdriver orangehrm login page")
    public void the_user_access_the_webdriver_orangehrm_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("the user entered the correct {string} and {string}")
    public void the_user_entered_the_correct(String string1, String string2) {
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       WebElement usernameField = driver.findElement(By.name("username"));
       WebElement passwordField = driver.findElement(By.name("password"));

        usernameField.sendKeys(string1);
        passwordField.sendKeys(string2);
    }

    @And("the user clicks login button")
    public void the_user_clicks_login_button() {
        WebElement loginButton = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
        loginButton.click();
    }

    @Then("the user should see{string}")
    public void the_user_should_see(String string3) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(5000))
                .ignoring(org.openqa.selenium.NoSuchElementException.class);
        WebElement dashboardTitle =
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a/span")));

        WebElement invalidCred = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]")));

        if (dashboardTitle.isDisplayed()){
            Assert.assertTrue(dashboardTitle.isDisplayed(),"Login was successful.");
        }else if (invalidCred.isDisplayed()){
            Assert.assertTrue(invalidCred.isDisplayed());
        }
    }

//    @When("the user entered the wrong {string} and {string}")
//    public void the_user_entered_the_wrong(String string4, String string5) {
//        WebElement usernameField = driver.findElement(By.name("username"));
//        WebElement passwordField = driver.findElement(By.name("password"));
//
//        usernameField.sendKeys(string4);
//        passwordField.sendKeys(string5);
//
//        WebElement InvalidCredentials = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]"));
//        Assert.assertEquals(string4, InvalidCredentials.getText());
//    }
//
//    @And("the user click login button")
//    public void the_user_click_login_button() {
//        WebElement loginButton = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
//        loginButton.click();
//    }
//
//    @Then("the user should see the {string}")
//    public void the_user_should_see_the(String string3) {
//        Wait<WebDriver> wait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(10))
//                .pollingEvery(Duration.ofMillis(5000))
//                .ignoring(org.openqa.selenium.NoSuchElementException.class);
//        WebElement dashboardTitle =
//                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[href='\\/web\\/index\\.php\\/dashboard\\/index'] .oxd-main-menu-item--name")));
//
//        Assert.assertTrue(dashboardTitle.isDisplayed(), "Login was successful");
//
//    }

}
