package PracticeSeleniumSec08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class L11_JavaScriptExecutor_Pt2 {

    private WebDriver driver;

    @Test(priority = 0)
    public void setUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void javaScript() {
        driver.get("https://www.automationtesting.co.uk/contactForm.html");

        driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("John");
        driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("Smith");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("johnsmith@test.com");
        driver.findElement(By.cssSelector("textarea[name='message']")).sendKeys("This is a message.");

        WebElement submit = driver.findElement(By.cssSelector("[type='submit']"));
        WebElement reset = driver.findElement(By.cssSelector("[type='reset']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click(), arguments[1].click()",reset,submit);
    }

}
