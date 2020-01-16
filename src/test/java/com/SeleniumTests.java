package com;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

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
    }

    @Test
    public void captureScreenshot() throws IOException {
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
        FileUtils.copyFile(srcFile, new File("/home/admin1/selenium1/src/test/resources/scrrenshot/captureScreenshot.jpg" + date2));
        System.out.println(Exception.class);
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
    }

    @Test
    public void keyboard_Mouse_Operationsthrows()throws InterruptedException, AWTException
    {
        driver.get("https://www.google.com");
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
    }

    @Test
    public void LoginWith_XpathAndCssSelector() throws Exception {
        Robot robot = new Robot();
        driver.get("https://twitter.com");
        WebElement Login = driver.findElement(By.xpath("//a[@class='js-nav EdgeButton EdgeButton--medium EdgeButton--secondary StaticLoggedOutHomePage-buttonLogin']"));
        Login.click();
        Thread.sleep(500);
        WebElement emailid = driver.findElement(By.xpath("//input[@placeholder='Phone, email or username']"));
        emailid.sendKeys("meghshah50@yahoo.com");
        WebElement pass = driver.findElement(By.xpath("//div[@class='clearfix field']//input[@placeholder='Password']"));
        pass.sendKeys("787898");
        WebElement login1 = driver.findElement(By.xpath("//*[@id=\"page-container\"]/div/div[1]/form/div[2]/button"));
        login1.click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div/header/div/div/div/div/div[3]/a/div")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[1]/div/div/div/div/div[2]/div[2]/div/div[3]/div/div/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div[2]/div/div/div/div")).sendKeys("hi,this is my second tweet by using selenium");
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[1]/div/div/div/div/div[2]/div[2]/div/div[3]/div/div/div[1]/div/div/div/div[2]/div[2]/div/div/div[1]/div[1]/div")).click();
        robot.setAutoDelay(2000);
        robot.setAutoDelay(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.setAutoDelay(2200);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.setAutoDelay(2200);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.setAutoDelay(2200);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.setAutoDelay(2200);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[4]/div[1]/span[1]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement moreOptions = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/div[1]/div[1]"));
        moreOptions.click();
        Thread.sleep(3000);
        WebElement Logout = driver.findElement(By.xpath("//span[contains(text(),'Log out')]"));
        Logout.click();
    }

    @Test
    public void facebookLoginTest() throws InterruptedException, AWTException {
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.facebook.com");
        WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        email.sendKeys("meghshah50@yahoo.com");
        WebElement pass = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
        pass.sendKeys("787898");
        WebElement login = driver.findElement(By.xpath("//input[@value='Log In']"));
        login.click();
        Thread.sleep(4000);

        WebElement dragDownButton = driver.findElement(By.xpath("//div[@id='userNavigationLabel']"));
        dragDownButton.click();
        Thread.sleep(2000);
        Robot r = new Robot();
        r.mouseMove(1128, 225);
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        WebElement elementLocator = driver.findElement(By.xpath("//li[@data-gt='{\"ref\":\"async_menu\",\"logout_menu_click\":\"menu_logout\"}']"));
        actions.contextClick(elementLocator).perform();
        //driver.findElement(By.xpath("//li[@data-gt='{\"ref\":\"async_menu\",\"logout_menu_click\":\"menu_logout\"}']")).click();
    }
}
