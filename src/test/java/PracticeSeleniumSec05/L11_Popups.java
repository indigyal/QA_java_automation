package PracticeSeleniumSec05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class L11_Popups {
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

        driver.findElement(By.cssSelector("[onclick='popup\\(\\)']")).click();

        String MainWindow = driver.getWindowHandle();

        Set<String> handles = driver.getWindowHandles();

        Iterator<String> iterate = handles.iterator();

        while (iterate.hasNext()){
            String child = iterate.next();
            if(!MainWindow.equalsIgnoreCase(child)){
                Thread.sleep(3000);
                driver.switchTo().window(child);
                driver.close();
            }
        }
        Thread.sleep(3000);
        driver.switchTo().window(MainWindow);
    }
}
