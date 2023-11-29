package PracticeSeleniumSec11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class L09_Annotation_Pt2 {
    WebDriver driver;

    @BeforeSuite
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);
    }

    @BeforeMethod
    public void signin() throws InterruptedException {
        driver.get("http://teststore.automationtesting.co.uk");
        driver.findElement(By.cssSelector("[title] .hidden-sm-down")).click();
        driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("testone@testing.com");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("TestingOne");
        driver.findElement(By.cssSelector("[data-link-action='sign-in']")).click();
        System.out.println("user has logged in");
        Thread.sleep(2000);

    }

    @Test
    public void test() throws InterruptedException {
        driver.findElement(By.partialLinkText("CLOTHES")).click();
        System.out.println("user has clicked the clothes link");
        Thread.sleep(2000);
    }

    @AfterMethod
    public void signout() throws InterruptedException {
        driver.findElement(By.cssSelector(".hidden-sm-down.logout")).click();
        System.out.println("user has logged out");
        Thread.sleep(2000);
    }

    @AfterSuite
    public void end() {
        driver.close();
        driver.quit();
    }
}
