package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxBrowser {
    public static void main(String[] args) {
        //storing URL in string datatype
        String baseUrl="https://demo.nopcommerce.com/login?returnUrl=%2F";

        //Set Property for firefox browser
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");

        //creating object of webdriver interface
        WebDriver driver=new FirefoxDriver();

        //Launching URl
        driver.get(baseUrl);

        //maximise the window
        driver.manage().window().maximize();

        //set implicit time for driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //print the title of page
        System.out.println("Title: "+ driver.getTitle());

        //print the current URL
        System.out.println("Current URL: "+ driver.getCurrentUrl());

        //print page source
        System.out.println("Page Source: "+ driver.getPageSource());

        //Enter email in email field using id locator
        WebElement emailField=driver.findElement(By.id("Email"));
        emailField.sendKeys("test@gmail.com");

        //Enter password in password field using name locator
        WebElement passwordField=driver.findElement(By.name("Password"));
        passwordField.sendKeys("Abc123");

        //close the browser
        driver.close();

    }
}
