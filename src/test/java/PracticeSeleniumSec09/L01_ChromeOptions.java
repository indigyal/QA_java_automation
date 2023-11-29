package PracticeSeleniumSec09;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class L01_ChromeOptions {

    private WebDriver driver;

    @Test(priority = 0)
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/index.html");
    }
}
