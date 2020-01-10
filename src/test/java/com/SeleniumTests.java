package com;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.nio.channels.Selector;
import java.util.Date;

public class SeleniumTests extends BaseClass {

    @Test
    public void seleniumTest() {
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void Login() throws InterruptedException
    {
        driver.get("https://www.facebook.com/");
        WebElement unTB = driver.findElement(By.id("email"));
        unTB.clear();
        unTB.sendKeys("hemilturakhia863@yahoo.com");
        WebElement passTB = driver.findElement(By.id("pass"));
        passTB.clear();
        passTB.sendKeys("abcd1234");
        Thread.sleep(2000);
        WebElement loginTB = driver.findElement(By.id("loginbutton"));
        loginTB.click();
        Thread.sleep(2000);
    }

    @Test
    public void BrowserNavigationExample() throws InterruptedException
    {
        driver.get("http://www.google.com");
        driver.navigate().to("http://www.gmail.com");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        driver.close();
    }

    @Test
    public void CaptureScreenshot_ActiTIMEPage() throws IOException {
        driver.manage().window().maximize();
        Date d = new Date();
        String date1 = d.toString();
        System.out.println(date1);
        String date2 = date1.replaceAll(":", "_");
        System.out.println(date2);
        driver.get("https://www.facebook.com");
        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
        File destFile = new File(".\\screenshot\\" + date2 + "__actiTIMELoginPage.png");
        FileUtils.copyFile(srcFile, new File("/home/admin1/selenium1/src/test/resources/scrrenshot/screenshot.jpg"));
        System.out.println(Exception.class);
        driver.close();
    }

    @Test
    public void UpcastingToWebDriver_LaunchBroser1(){
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.println("the title of the page is:"+ title);
        String currentUrl = driver.getCurrentUrl();
        System.out.println("the URL of the page is:"+ currentUrl);
        String pageSource = driver.getPageSource();
        System.out.println("the source code of the page is"+ pageSource);
        driver.close();
    }

    @Test
    public void keyboard_Mouse_Operationsthrows()throws InterruptedException, AWTException
    {
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        Robot r = new Robot();
        r.mouseMove(300, 500);
        r.keyPress(KeyEvent.VK_ALT);
        r.keyPress(KeyEvent.VK_F);
        r.keyRelease(KeyEvent.VK_F);
        r.keyRelease(KeyEvent.VK_ALT);
        Thread.sleep(3000);
        r.keyPress(KeyEvent.VK_W);
        r.keyRelease(KeyEvent.VK_W);
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void LoginWith_XpathAndCssSelector() throws InterruptedException {
        driver.get("https://twitter.com");
        WebElement Login = driver.findElement(By.xpath("//*[@id=\"doc\"]/div/div[1]/div[1]/div[2]/div[2]/div/a[2]"));
        Login.click();
        driver.get("https://twitter.com/login");
        WebElement emailid = driver.findElement(By.xpath("//*[@id=\"page-container\"]/div/div[1]/form/fieldset/div[1]/input"));
        emailid.sendKeys("meghshah50@yahoo.com");
        WebElement pass = driver.findElement(By.cssSelector("#page-container > div > div.signin-wrapper > form > fieldset > div:nth-child(3) > input"));
        pass.sendKeys("787898");
        WebElement login1 = driver.findElement(By.xpath("//*[@id=\"page-container\"]/div/div[1]/form/div[2]/button"));
        login1.click();
        driver.get("https://facebook.com/");
    }
}
