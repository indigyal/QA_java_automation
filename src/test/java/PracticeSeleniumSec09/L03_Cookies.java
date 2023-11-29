package PracticeSeleniumSec09;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class L03_Cookies {

    private WebDriver driver;

    @Test(priority = 0)
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://teststore.automationtesting.co.uk/");

        driver.findElement(By.cssSelector("[title] .hidden-sm-down")).click();
        driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("testone@testing.com");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("TestingOne");
        driver.findElement(By.cssSelector("button#submit-login")).click();
        driver.findElement(By.partialLinkText("CLOTHES")).click();
        driver.findElement(By.cssSelector("[alt='Hummingbird printed t-shirt']")).click();
        driver.findElement(By.cssSelector(".add-to-cart.btn.btn-primary")).click();

        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".btn.btn-secondary")).click();

        driver.manage().deleteAllCookies();
    }
    
}
