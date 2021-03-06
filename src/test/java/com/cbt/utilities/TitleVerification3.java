package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {

    public static void main(String[] args) throws Exception {


        List<String> urls = Arrays.asList("https://lulugandgeorgia.com",
                "https://wayfair.com/", "https://walmart.com", "https://westelm.com/");
//
//        List<String> urls = Arrays.asList("https://google.com",
//                "https://wayfair.com/", "https://walmart.com", "https://amazon.com/");



        for (String url:urls) {

            WebDriver driver= BrowserFactory.getDriver("chrome");
            driver.get(url);
            Thread.sleep(1000);
            String title=driver.getTitle().toLowerCase().replace(" ","");
            System.out.println(driver.getCurrentUrl());
//            System.out.println(title);
            if (driver.getCurrentUrl().contains(title)) {
                System.out.println("PASSED");
            } else {
                System.out.println("FAILED");
            }

            driver.quit();
        }


    }
}
