package PracticeSeleniumSec05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class L07_Alerts {
    private WebDriver driver;

    @Test(priority =0)
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void myTest() throws InterruptedException {

        driver.get("https://www.automationtesting.co.uk/popups.html");
        driver.findElement(By.cssSelector("[onclick='alertTrigger\\(\\)']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();// used to accept the alert
        //driver.switchTo().alert().dismiss();// used to cancel the alert

    }
}
