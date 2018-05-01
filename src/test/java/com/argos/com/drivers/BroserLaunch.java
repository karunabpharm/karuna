package com.argos.com.drivers;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class BroserLaunch {
    public static WebDriver driver;
    private String browser = "chrome";

    public void openBrowser() {
        switch (browser) {
            case "chrome":
                ChromeDriverManager.getInstance().setup();
                driver = new ChromeDriver();
                break;
            case "ie":
                InternetExplorerDriverManager.getInstance().setup();
                driver = new InternetExplorerDriver();
                break;
            default:
                FirefoxDriverManager.getInstance().setup();
                driver = new FirefoxDriver();
                break;
        }

        driver.get("http://www.argos.co.uk/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void closeBrowser() {
        driver.quit();
    }

    public void sleep() {
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

