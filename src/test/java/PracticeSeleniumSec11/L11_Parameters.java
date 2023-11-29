package PracticeSeleniumSec11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class L11_Parameters {
    WebDriver driver;

    @BeforeSuite
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);
    }
    @Parameters({"email" , "password"})
    @Test
    public void signin(String email, String password) throws InterruptedException {
        driver.get("http://teststore.automationtesting.co.uk");
        driver.findElement(By.cssSelector("[title] .hidden-sm-down")).click();
        driver.findElement(By.cssSelector("section input[name='email']")).sendKeys(email);
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("button#submit-login")).click();
        System.out.println("user has logged in");
        Thread.sleep(2000);

    }

    @AfterSuite
    public void end() {
        driver.close();
        driver.quit();
    }
}
