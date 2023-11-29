package PracticeSeleniumSec04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/indigyal/Desktop/resources/Drivers_v1/geckodriver");

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("https://www.automationtesting.co.uk");
    }
}
