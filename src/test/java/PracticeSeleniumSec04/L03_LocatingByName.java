package PracticeSeleniumSec04;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L03_LocatingByName {
    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "/Users/indigyal/Desktop/resources/Drivers_v1/chromedriver");

            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://www.automationtesting.co.uk/contactForm.html");

            driver.findElement(By.name("first_name")).sendKeys("abcd");
        }

}
