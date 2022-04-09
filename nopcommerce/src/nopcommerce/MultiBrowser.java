package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {
    static String browser="chrome";
    static String baseUrl="https://demo.nopcommerce.com/login?returnUrl=%2F";
    static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            driver=new ChromeDriver();
        }else if(browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
            driver=new EdgeDriver();
        }else if(browser.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
            driver=new FirefoxDriver();
        }else {
            System.out.println("Incorrect Browser Name.");
        }

        driver.get(baseUrl);

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        System.out.println("Title: "+driver.getTitle());

        System.out.println("Current URL: "+driver.getCurrentUrl());

        System.out.println("Page Source: "+driver.getPageSource());

        WebElement emailField=driver.findElement(By.id("Email"));
        emailField.sendKeys("test@gmail.com");

        WebElement passwordField=driver.findElement(By.name("Password"));
        passwordField.sendKeys("Abc123");

        driver.close();
    }
}
