package PracticeSeleniumSec05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class L09_Assertions_pt1 {
    private WebDriver driver;

    @Test(priority =0)
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void myTest()  {

        driver.get("https://www.automationtesting.co.uk");

        String pageTitle = driver.getTitle();
        Assert.assertEquals("Homepage",pageTitle);
    }
}
