package PracticeSeleniumSec08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class L06_Iframes {
    private WebDriver driver;

    @Test(priority = 0)
    public void setUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void testIframes() throws InterruptedException {
        driver.get("https://www.automationtesting.co.uk/iframes.html");

        driver.switchTo().frame(0);
        driver.findElement(By.cssSelector(".toggle")).click();

        Thread.sleep(2000);

        driver.switchTo().parentFrame();
        driver.findElement(By.cssSelector(".toggle")).click();

        Thread.sleep(2000);

        driver.switchTo().frame(1);
        driver.findElement(By.cssSelector("[aria-label='Play']")).click();


    }
}
