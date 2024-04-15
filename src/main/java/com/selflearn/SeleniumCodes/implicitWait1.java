package com.selflearn.SeleniumCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class implicitWait1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers and libs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login/");

        WebElement EmailTxt = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement PasswordTxt = driver.findElement(By.xpath("//input[@name='pass']"));
        WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));

        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS); // implicit wait
        //enter values in input fields
        EmailTxt.sendKeys("abc@gmail.com");

        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS); // implicit wait
        PasswordTxt.sendKeys("12345");
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS); // implicit wait

        //click on login btn
        LoginBtn.click();

    }
}
