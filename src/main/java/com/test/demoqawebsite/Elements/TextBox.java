package com.test.demoqawebsite.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TextBox {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers and libs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //automation website practice
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement selectBox = driver.findElement(By.xpath("(//div[@class=\"card mt-4 top-card\"])[1]"));
        jse.executeScript("arguments[0].scrollIntoView()", selectBox);
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        selectBox.click();

        // click on elements

        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        WebElement text = driver.findElement(By.xpath("//div[contains(text(),'Elements')]"));
        text.click();

        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        //select first element of list
        WebElement dropElement = driver.findElement(By.xpath("(//ul[@class=\"menu-list\"])[1]"));
        List<WebElement> droplist = dropElement.findElements(By.xpath("(//ul[@class=\"menu-list\"])[1]//li"));

        droplist.get(0).click();


        driver.close();
    }
}
