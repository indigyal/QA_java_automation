package firstTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeworkNov14 {
    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @Test
    public void searchAmazon(){
        driver.get("https://www.amazon.com/");
        //input#twotabsearchtextbox
        driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Minecraft Toys");
        //input#nav-search-submit-button
        driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();

//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeAsyncScript("window.scrollBy(0,document.body.scrollHeight)");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
