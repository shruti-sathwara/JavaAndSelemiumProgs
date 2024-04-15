package com.selflearn.SeleniumCodes;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLoginTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers and libs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        //find web element bu xpaths
        WebElement EmailTxt = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement PasswordTxt = driver.findElement(By.xpath("//input[@name='pass']"));
        WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));

        //enter values in input fields
        EmailTxt.sendKeys("abc@gmail.com");
        PasswordTxt.sendKeys("12345");

        //click on login btn
        LoginBtn.click();

    }
}
