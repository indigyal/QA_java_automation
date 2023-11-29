package firstTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SendMessageAssignment {
    private WebDriver driver;

    @Test(priority = 0)
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void openGoogle() {
        String url = "https://www.google.com/";
        driver.get(url);

        String title = driver.getTitle();
        Assert.assertEquals(title, "Google");

        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.click();
        searchbox.sendKeys("Slack");
        searchbox.submit();
    }

    @Test(dependsOnMethods = "openGoogle")
    public void clickOnSlack() {
        driver.get("https://slack.com/");
        driver.findElement(By.partialLinkText("Sign in")).click();
        driver.findElement(By.partialLinkText("sign in manually instead")).click();
        driver.findElement(By.cssSelector("input#domain")).sendKeys("creativecodingcollect");
        driver.findElement(By.cssSelector("[data-qa='submit_team_domain_button']")).click();
        driver.findElement(By.partialLinkText("sign in with a password instead")).click();

        //[data-qa='submit_team_domain_button']
        //input#domain
        //creativecodingcollect
    }

    @Test(dependsOnMethods = "clickOnSlack")
    public void loginToSlack() {
        driver.findElement(By.cssSelector("input#email")).sendKeys("indigyal@gmail.com");
        driver.findElement(By.cssSelector("input#password")).sendKeys("Thorton@2023");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

        driver.findElement(By.cssSelector("button#signin_btn")).click();
    }

    @Test(dependsOnMethods = "loginToSlack")
    public void sendMessageOnSlack() {

        driver.get("https://creativecodingcollect.slack.com/ssb/redirect?entry_point=signin");
        driver.get("https://app.slack.com/client/T0191DW1YSZ/D060KPB7BB4");

//        String btnXmlPath = "/html/body/div[2]/div/div/div[4]/div[2]/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/div/div/div[2]/div/div/div/div[3]/div[3]/span/button[1]";

        WebElement body = driver.findElement(By.tagName("body"));
//        WebElement editorDiv = body.findElement(By.xpath("//div[@class='ql-editor']"));
        System.out.println("Test print starts ................");
        System.out.println(body.getAttribute("class"));
    }
}


