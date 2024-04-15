package com.selflearn.SeleniumCodes;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers and libs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();


        Thread.sleep(5000);
        //create button
        WebElement creteAccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        creteAccount.click();

        Thread.sleep(5000);

        //radio button click

        WebElement FemaleRB = driver.findElement(By.xpath("//input[@value='1']"));
        FemaleRB.click();

        Thread.sleep(2000);
        WebElement MaleRB = driver.findElement(By.xpath("//input[@value='2']"));
        MaleRB.click();

        Thread.sleep(2000);
        WebElement CustomRB = driver.findElement(By.xpath("//input[@value='-1']"));
        CustomRB.click();

    }
}
