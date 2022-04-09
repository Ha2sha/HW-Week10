package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowser {
    public static void main(String[] args) {
        //storing URL in String datatype
        String baseUrl = "https://www.saucedemo.com/";

        //Set property for Edge browser
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");

        //creating object of webdriver interface
        WebDriver driver = new EdgeDriver();

        //Launching the browser
        driver.get(baseUrl);

        //maximise windows
        driver.manage().window().maximize();

        //set implicit time for driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

        //print page title
        System.out.println("Title: " + driver.getTitle());
        //print current URl
        System.out.println("Current URL: " + driver.getCurrentUrl());
        //print page source
        System.out.println("Page Source: " + driver.getPageSource());

        //finding username element
        WebElement userNameField = driver.findElement(By.id("user-name"));
        //sending username to username field
        userNameField.sendKeys("standard_user");

        //finding password element
        WebElement passwordField = driver.findElement(By.name("password"));
        //sending password to password field
        passwordField.sendKeys("secret_sauce");

        //closing browser
        driver.close();

    }
}
