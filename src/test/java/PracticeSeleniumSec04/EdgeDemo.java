package PracticeSeleniumSec04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "/Users/indigyal/Desktop/resources/Drivers_v1/msedgedriver");

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.automationtesting.co.uk");
    }
}
