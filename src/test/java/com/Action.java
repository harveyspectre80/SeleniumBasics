package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Action {
    public static WebDriver driver;

    public static void openBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "C:UsersVardhanDownloadschromedriver.exe");
        driver=new ChromeDriver();
    }

    public static void navigate()
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://newtours.demoaut.com");
    }

    public static void input_Username()
    {
        driver.findElement(By.name("userName")).sendKeys("mercury");
    }

    public static void input_Password()
    {
        driver.findElement(By.name("password")).sendKeys("mercury");
    }

    public static void click_Login()
    {
        driver.findElement(By.name("login")).click();
    }

    @Test
    public static void verify_login()
    {
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Find a Flight: Mercury Tours:");
    }

    public static void closeBrowser()
    {
        driver.quit();
    }
}
