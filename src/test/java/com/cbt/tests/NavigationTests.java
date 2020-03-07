package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {

    public static void main(String[] args) {

        chromeTest();
        //firefoxTest();
        //safariTest();
        //edgeTest();
    }

    public static void chromeTest() {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        String title1=driver.getTitle();
        driver.get("https://etsy.com");
        String title2=driver.getTitle();
        driver.navigate().back();

        StringUtility.verifyEquals(driver.getTitle(),title1);
        driver.navigate().forward();
        StringUtility.verifyEquals(driver.getTitle(),title2);
        driver.quit();
    }


    public static void firefoxTest() {
        WebDriver driver= BrowserFactory.getDriver("firefox");
        driver.get("https://google.com");
        String title1=driver.getTitle();
        driver.get("https://etsy.com");
        String title2=driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals(driver.getTitle(),title1);
        driver.navigate().forward();
        StringUtility.verifyEquals(driver.getTitle(),title2);

        driver.quit();
    }

    public static void safariTest() {
        WebDriver driver= BrowserFactory.getDriver("safari");
        driver.get("https://google.com");
        String title1=driver.getTitle();
        driver.get("https://etsy.com");
        String title2=driver.getTitle();
        driver.navigate().back();

        StringUtility.verifyEquals(driver.getTitle(),title1);
        driver.navigate().forward();
        StringUtility.verifyEquals(driver.getTitle(),title2);
        driver.quit();
    }

    public static void edgeTest() {
        WebDriver driver= BrowserFactory.getDriver("edge");
        driver.get("https://google.com");
        String title1=driver.getTitle();
        driver.get("https://etsy.com");
        String title2=driver.getTitle();
        driver.navigate().back();

        StringUtility.verifyEquals(driver.getTitle(),title1);
        driver.navigate().forward();
        StringUtility.verifyEquals(driver.getTitle(),title2);
        driver.quit();
    }

}
