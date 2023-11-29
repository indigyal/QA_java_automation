package firstTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeworkNov15 {
    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void openGoogle() {
        String url = "https://www.google.com/";
        driver.get(url);

        String title = driver.getTitle();
        Assert.assertEquals(title, "Google");

        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.click();
        searchbox.sendKeys("slack login");
        searchbox.submit();
    }
    @Test(dependsOnMethods = "openGoogle")
    public void clickOnSlack(){
        WebElement slackLink = driver.findElement(By.partialLinkText("https://slack.com/workspace-signin"));

        Assert.assertNotNull(slackLink);

        slackLink.click();
    }

    @Test(dependsOnMethods = "clickOnSlack")
    public void assertSlack() {
        String pageTitle = driver.getTitle();
        Assert.assertTrue(pageTitle.contains("Slack"));
    }

}
