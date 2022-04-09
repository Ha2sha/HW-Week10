package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowser {
    public static void main(String[] args) {
        //Store URL in String Datatype
        String baseUrl="https://demo.nopcommerce.com/login?returnUrl=%2F";

        //Set property for Edge Browser
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");

        //Creating object of web driver interface
        WebDriver driver=new EdgeDriver();

        //Launch URL
        driver.get(baseUrl);

        //Maximise the window
        driver.manage().window().maximize();

        //Give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Print the Title of page
        System.out.println("Title: "+driver.getTitle());

        //Print the current URl
        System.out.println("Current URL: "+driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page Source: "+driver.getPageSource());

        //Enter the email to email field using id locator
        WebElement emailField= driver.findElement(By.id("Email"));
        emailField.sendKeys("test@gmail.com");

        //enter the password to password field using name locator
        WebElement passwordField=driver.findElement(By.name("Password"));
        passwordField.sendKeys("Abc123");

        //close the browser
        driver.close();

    }
}
