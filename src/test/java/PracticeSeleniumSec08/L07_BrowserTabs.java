package PracticeSeleniumSec08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class L07_BrowserTabs {
    private WebDriver driver;

    @Test(priority = 0)
    public void setUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void testBrowserTabs() throws InterruptedException {
        driver.get("https://www.automationtesting.co.uk/browserTabs.html");

        for(int i = 0; i < 3; i++) {
            driver.findElement(By.xpath("//input[@value='Open Tab']")).click();
        }

        ArrayList<String> windowHandles = new ArrayList<String>(driver.getWindowHandles());
        System.out.println("There are " + windowHandles.size() + " tabs open.");

        for (String item:windowHandles) {
            Thread.sleep(1500);
            driver.switchTo().window(item);
        }
        Thread.sleep(1500);
        driver.switchTo().window(windowHandles.get(0));
    }
}
