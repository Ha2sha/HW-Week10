package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FriefoxBrowser {
    public static void main(String[] args) {
        //Store URL in String datatype
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";

        //Set property for Firefox Browser
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

        //creating object of webdriver interface
        WebDriver driver = new FirefoxDriver();

        //Launching the browser
        driver.get(baseUrl);

        //maximise the window
        driver.manage().window().maximize();

        //set implicit time for driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //print page title
        System.out.println("Title: " + driver.getTitle());
        //print current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());
        //print page source
        System.out.println("Page Source: " + driver.getPageSource());

        //entering username in username field using id locator
        WebElement userNameField = driver.findElement(By.id("txtUsername"));
        userNameField.sendKeys("Admin");

        //entering password in password field using name locator
        WebElement passwordField = driver.findElement(By.name("txtPassword"));
        passwordField.sendKeys("admin123");

        //closing browser
        //driver.close();
    }
}
