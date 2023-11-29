package firstTest;

import com.aventstack.extentreports.ExtentReports;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.io.File;
import java.time.Duration;

public class SeleniumTwo {
    private WebDriver driver;

    private static ExtentReports extentReports;

    @Test(priority = 0)
    public void setDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test(priority = 1)
    public void dropDownTest(){
        driver.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement dropDownelement = driver.findElement(By.xpath("/html//div[@id='wrapper']/div[@class='content_bgr']/div[@class='container startNow']/div/div//div[@class='resp-tabs-container']/div//select"));

        Select select = new Select(dropDownelement);

        select.selectByVisibleText("United States");

        WebElement selectedOption = select.getFirstSelectedOption();
        assert selectedOption.getText().equals("United States");
    }

    @Test(priority = 2)
    public void AlertTest(){
        driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement alertButton = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
        alertButton.click();
        driver.switchTo().alert().accept();

    }

    @AfterMethod
    public void tearDown(ITestResult result) throws Exception{
        if (result.getStatus() == ITestResult.SUCCESS){
            try {
                TakesScreenshot ts = (TakesScreenshot) driver;
                File source = ts.getScreenshotAs(OutputType.FILE);
                String screenshotName = result.getName() + ".png";
                File destination = new
                        File(System.getProperty("user.dir")+ "/screenshots/"+ screenshotName);
                FileUtils.copyFile(source, destination);
                System.out.println("screenshot Taken: " + screenshotName);

            }catch (Exception e){
                System.out.println("exception occurred wile taking screenshot: " + e.getMessage());
            }
        }




    }
}
