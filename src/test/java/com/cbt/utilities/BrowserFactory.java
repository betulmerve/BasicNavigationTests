package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {
    public static void main(String[] args) {

    }

    public static WebDriver getDriver(String browser) {

        if (System.getProperty("os.name").contains("Mac") && browser.equalsIgnoreCase("edge")) {
            System.out.println("you can not use edge, you have mac:)");
            return null;
        }
        if (System.getProperty("os.name").contains("Windows") && browser.equalsIgnoreCase("safari")) {
            System.out.println("you can not use safari, you have windows:)");
            return null;
        }
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().version("79.0").setup();
            return new ChromeDriver();
        }
        if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }

        if (browser.equalsIgnoreCase("safari")) {
           return new SafariDriver();
        }
        else {
            return null;
        }
    }
}
