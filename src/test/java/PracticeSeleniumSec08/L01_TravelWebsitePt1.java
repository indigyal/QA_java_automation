package PracticeSeleniumSec08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class L01_TravelWebsitePt1 {
    private WebDriver driver;

    @Test(priority = 0)
    public void setUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void openEasyJet() throws InterruptedException {
        driver.get("https://www.easyjet.com/en/");
        driver.findElement(By.id("ensCloseBanner")).click();

        //Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[name='origin']")).click();
        driver.findElement(By.cssSelector("input[name='origin']")).sendKeys("London");
        List<WebElement> origins = new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#ui-id-1 li>a>span")));


        for(WebElement origin : origins){
            //System.out.println(origin.getText());
            if(origin.getText().contains("Luton")){
                origin.click();
            }
        }
    }
}
