package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {

    public static void main(String[] args) {


        chromeTest();
        //firefoxTest();
    }

    public static void chromeTest() {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        String title1=driver.getTitle();
        driver.get("https://etsy.com");
        String title2=driver.getTitle();
        driver.navigate().back();

        StringUtility.verifyEquals(driver.getTitle(),title1);

//        if (driver.getTitle().equals(title1)) {
//            System.out.println("PASSED");
//        } else {
//            System.out.println("FAILED");
//        }
        driver.navigate().forward();

        StringUtility.verifyEquals(driver.getTitle(),title2);

//        if (driver.getTitle().equals(title2)) {
//            System.out.println("PASSED");
//        } else {
//            System.out.println("FAILED");
//        }

        driver.quit();
    }


    public static void firefoxTest() {
        WebDriver driver= BrowserFactory.getDriver("firefox");
        driver.get("https://google.com");
        String title1=driver.getTitle();
        driver.get("https://etsy.com");
        String title2=driver.getTitle();
        driver.navigate().back();

        if (driver.getTitle().equals(title1)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
        driver.navigate().forward();
        if (driver.getTitle().equals(title2)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }

        driver.quit();
    }

}
