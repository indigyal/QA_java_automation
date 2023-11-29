package PracticeSeleniumSec05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class L06_DropdownMenu {
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

        Select menuitem = new Select(driver.findElement(By.cssSelector("#cars")));

        //menuitem.selectByVisibleText("BMW");

        menuitem.selectByValue("jeep");

    }
}
