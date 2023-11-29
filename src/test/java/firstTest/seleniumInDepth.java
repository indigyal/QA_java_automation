package firstTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;



//fluent wait- waits until a given condition is met- tries for every interval.
//implicit wait- waits for a given duration of time regardless of actions.
//explicit wait--waits until a given condition is met

public class seleniumInDepth {

    private WebDriver driver;

    @Test(priority = 0)
    public void setDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test(priority = 1)
    public void myTest(){
        //driver.get("https://google.com");
        driver.navigate().to("https://www.globalsqa.com/demo-site/select-elements/#Multiple%20Selection");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        try {
            WebElement iframes = driver.findElement(By.xpath("//*[@id=\"post-2649\"]/div[2]/div/div/div[1]/p/iframe"));

            driver.switchTo().frame(iframes);

            WebElement item2 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]"));

            String backgroundColorBeforeClick = item2.getCssValue("background-color");

            item2.click();

            String backgroundColorAfterClick = item2.getCssValue("background-color");

            if (!backgroundColorBeforeClick.equals(backgroundColorAfterClick)) {
                System.out.println("Clicked on 'Item 2', and background color changed.");
            } else {
                System.out.println("Clicked on 'Item 2', but background color did not change.");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test(priority = 2)
    public void tearDown(){
        if (driver!=null){
            driver.quit();
        }
    }
}







