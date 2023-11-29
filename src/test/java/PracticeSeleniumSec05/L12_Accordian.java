package PracticeSeleniumSec05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class L12_Accordian {
    private WebDriver driver;

    @Test(priority =0)
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void myTest() {

        driver.get("https://www.automationtesting.co.uk/accordion.html");

        //.accordion > div:nth-of-type(1)
        //.accordion > div:nth-of-type(3)
        //.accordion > div:nth-of-type(5)

        for(int i = 1; i <= 10; i++){
            driver.findElement(By.cssSelector(".accordion > div:nth-of-type(1)")).click();
            driver.findElement(By.cssSelector(".accordion > div:nth-of-type(3)")).click();
            driver.findElement(By.cssSelector(".accordion > div:nth-of-type(5)")).click();        }
    }
}
