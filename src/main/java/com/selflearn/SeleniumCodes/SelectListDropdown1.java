package com.selflearn.SeleniumCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SelectListDropdown1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers and libs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();

        Thread.sleep(5000);
        //create button
        WebElement creteAccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        creteAccount.click();

        //days
        Thread.sleep(5000);
        List<WebElement> dobDays = driver.findElements(By.xpath("//select[@id='day']//option"));
        dobDays.get(3).click();

        //select list DOB- month
        Thread.sleep(5000);
        List<WebElement> dobmonths = driver.findElements(By.xpath("//select[@id='month']//option"));
        dobmonths.get(5).click();

        //select list DOB- year
        Thread.sleep(5000);
        List<WebElement> dobYear = driver.findElements(By.xpath("//select[@id='year']//option"));
        dobYear.get(5).click();

        System.out.println("size day==>" + dobDays.size());
        System.out.println("size month==>" + dobmonths.size());
        System.out.println("size year==>" + dobYear.size());
    }
}
