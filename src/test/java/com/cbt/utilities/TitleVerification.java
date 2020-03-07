package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification {

    public static void main(String[] args) throws Exception {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        WebDriver driver = BrowserFactory.getDriver("chrome");

        List<String> titles=new ArrayList<>();
        List<String> visitedUrls=new ArrayList<>();

        for (String url:urls) {
            driver.get(url);
            Thread.sleep(1000);
            titles.add(driver.getTitle());
            visitedUrls.add(driver.getCurrentUrl());
        }

//        System.out.println(titles);
//        System.out.println(visitedUrls);

        for (String title:titles) {
            StringUtility.verifyEquals("Practice",title);
        }

        for (String each:visitedUrls) {
            if (each.startsWith("http://practice.cybertekschool.com")) {
                System.out.println("PASSED");
            } else {
                System.out.println("FAILED");
            }
        }

//        if (title1.equals(title2) && title2.equals(title3)) {
//            System.out.println("PASSED");
//        } else {
//            System.out.println("FAILED");
//        }
//
//        if (url1.startsWith("http://practice.cybertekschool.com") &&
//                url2.startsWith("http://practice.cybertekschool.com") &&
//                url3.startsWith("http://practice.cybertekschool.com")) {
//            System.out.println("PASSED");
//        } else {
//            System.out.println("FAILED");
//        }

        driver.quit();
    }
}
