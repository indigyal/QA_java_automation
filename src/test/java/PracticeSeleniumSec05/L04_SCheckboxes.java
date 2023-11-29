package PracticeSeleniumSec05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class L04_SCheckboxes {
    private WebDriver driver;

    @Test(priority =0)
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void myTest(){

        driver.get("https://www.automationtesting.co.uk/dropdown.html");
        System.out.println(driver.findElement(By.cssSelector("input#cb_red")).isSelected());
        System.out.println(driver.findElement(By.cssSelector("input#cb_green")).isSelected());

//input#cb_green
    }
}
