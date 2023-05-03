package com.qa.webtest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestWeb {
    @Test
    public void testChrome() throws InterruptedException {
        System.out.println("--------Hello World - CHROME--------");
        System.out.println("--------Open Google and Get the Title--------");


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.google.com/");
        Thread.sleep(5000);

        String strTitle = driver.getTitle();
        System.out.println(strTitle);
        Assert.assertTrue(strTitle.equals("Google"));

        driver.quit();

    }

    @Test
    public void testFirefox() throws InterruptedException {
        System.out.println("--------Hello World - FIREFOX--------");
        System.out.println("--------Open Google and Get the Title--------");


        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.google.com/");
        Thread.sleep(5000);

        String strTitle = driver.getTitle();
        System.out.println(strTitle);
        Assert.assertTrue(strTitle.equals("Google"));

        driver.quit();

    }
}
