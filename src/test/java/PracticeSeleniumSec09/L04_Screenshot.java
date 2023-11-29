package PracticeSeleniumSec09;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class L04_Screenshot {

    private WebDriver driver;

    @Test(priority = 0)
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.automationtesting.co.uk/");

    }

    @AfterMethod
    public void takeScreenshot(ITestResult result) {
        if (result.getStatus() == ITestResult.SUCCESS) {
            try {
                TakesScreenshot ts = (TakesScreenshot) driver;
                File source = ts.getScreenshotAs(OutputType.FILE);
                String screenshotName = result.getName() + "+ .png";
                File destination = new
                        File(System.getProperty("/Users/indigyal/IdeaProjects/QAAuto_Oct_2023/screenshots") + "/screenshots/" + timeStamp() + screenshotName);
                FileUtils.copyFile(source, destination);
                System.out.println("screenshot Taken: " + screenshotName);

            } catch (Exception e) {
                System.out.println("exception occurred wile taking screenshot: " + e.getMessage());
            }
        }
    }

    public static String timeStamp(){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
}
