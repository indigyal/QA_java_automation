package PracticeSeleniumSec05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class L10_Assertions_pt2 {
    private WebDriver driver;

    @Test(priority =0)
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void myTest() throws InterruptedException {

        driver.get("https://www.automationtesting.co.uk");
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);

        driver.findElement(By.linkText("TEST STORE")).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("img[alt='Hummingbird printed t-shirt']")).click();
        driver.findElement(By.cssSelector(".add-to-cart.btn.btn-primary")).click();

        Thread.sleep(2000);

        String total = driver.findElement(By.cssSelector(".product-total > .value")).getText();

        Assert.assertEquals("$26.12", total);

    }
}
