package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        //Store URL in String datatype
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";

        //Set property for Chrome Browser
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        //creating object of webdriver interface
        WebDriver driver = new ChromeDriver();

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
        driver.close();
    }

}
