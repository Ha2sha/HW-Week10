package ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxBrowser {
    public static void main(String[] args) {
        //storing URL to String datatype
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";

        //Set property of Edge browser
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

        //creating object of webdriver interface
        WebDriver driver = new FirefoxDriver();

        //Launching URL
        driver.get(baseUrl);

        //maximise window
        driver.manage().window().maximize();

        //set implicit time for driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //print page title
        System.out.println("Title: " + driver.getTitle());
        //print current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());
        //print page Source
        System.out.println("Page Source: " + driver.getPageSource());

        //find email element using id locator
        WebElement emailField = driver.findElement(By.id("user[email]"));
        //sending email to email element
        emailField.sendKeys("test@gmail.com");

        //find password element using name locator
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        //sending password to password element
        passwordField.sendKeys("Abc123");

        //closing browser
        //driver.close();
    }
}
