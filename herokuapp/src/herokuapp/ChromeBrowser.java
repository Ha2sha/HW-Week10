package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        //storing URL in String datatype
        String baseUrl = "http://the-internet.herokuapp.com/login";

        //set property for chrome browser
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        //creating object of webdriver interface
        WebDriver driver = new ChromeDriver();

        //launching URL
        driver.get(baseUrl);

        //maximise window
        driver.manage().window().maximize();

        //set implicit time for driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //print page title
        System.out.println("Title: " + driver.getTitle());

        //print current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        //print page source
        System.out.println("Page Source: " + driver.getPageSource());

        //find the username field element
        WebElement userNameField = driver.findElement(By.id("username"));
        //sending username to username field element
        userNameField.sendKeys("tomsmith");

        //find the password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        //sending password to password field element
        passwordField.sendKeys("SuperSecretPassword!");

        //close the browser
        driver.close();
    }
}
