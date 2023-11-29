package PracticeSeleniumSec05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class L08_RadioButtons {
    private WebDriver driver;

    @Test(priority =0)
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void myTest() throws InterruptedException {

        driver.get("https://www.automationtesting.co.uk/dropdown.html");

        //[for='demo-priority-low']
        //[for='demo-priority-normal']
        //[for='demo-priority-high']

        driver.findElement(By.cssSelector("[for='demo-priority-low']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("[for='demo-priority-normal']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("[for='demo-priority-high']")).click();
    }
}
