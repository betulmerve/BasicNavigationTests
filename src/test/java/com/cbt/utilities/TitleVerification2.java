package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {

    public static void main(String[] args) throws Exception {

        List<String> urls = Arrays.asList("https://lulugandgeorgia.com",
                "https://wayfair.com/", "https://walmart.com", "https://westelm.com/");

        WebDriver driver= BrowserFactory.getDriver("chrome");

        for (String url:urls) {

            driver.get(url);
            Thread.sleep(2000);
            String title=driver.getTitle().toLowerCase().replace(" ","");
            System.out.println(driver.getCurrentUrl());
//            System.out.println(title);
            if (driver.getCurrentUrl().contains(title)) {
                System.out.println("PASSED");
            } else {
                System.out.println("FAILED");
            }
        }

        driver.quit();



    }
}
