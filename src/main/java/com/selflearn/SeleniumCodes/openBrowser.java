package com.selflearn.SeleniumCodes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openBrowser {

    public static void main(String[] args) {

        // need to add selenium jars

        // Set the path of the ChromeDriver binary
        System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers and libs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Initialize Chrome WebDriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        driver.manage().window().maximize(); // maximize windows
    }

}
