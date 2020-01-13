package com;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
    WebDriver driver;

    @BeforeMethod
    public void Before() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
         driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void  After()
    {
        driver.close();
    }

}
