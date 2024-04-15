package com.selflearn.SeleniumCodes;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorXpath {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers and libs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login/");

        //email  --> css selector for ID
        WebElement emailTxt = driver.findElement(By.cssSelector("input#email")); //1st way
        WebElement pwdTxt = driver.findElement(By.cssSelector("input[id='pass']")); //2nd way
        WebElement loginTxt = driver.findElement(By.cssSelector("#loginbutton")); //3rd way

        emailTxt.sendKeys("abc@gmail.com");
        pwdTxt.sendKeys("abc");
        loginTxt.click();
    }
}
