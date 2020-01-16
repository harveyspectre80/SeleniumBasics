package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class TwitterExample {
        ChromeDriver driver;

        @Test(dataProvider="testdata")
        public void DemoProject(String username, String password) throws InterruptedException, AWTException {
            System.setProperty("webdriver.chrome.driver", "chromedriver");
            driver = new ChromeDriver();
            Robot robot = new Robot();
            driver.get("https://www.twitter.com");
            driver.findElement(By.xpath("//a[@class='js-nav EdgeButton EdgeButton--medium EdgeButton--secondary StaticLoggedOutHomePage-buttonLogin']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Phone, email or username']")).sendKeys(username);
            driver.findElement(By.xpath("//div[@class='clearfix field']//input[@placeholder='Password']")).sendKeys(password);
            driver.findElement(By.xpath("//*[@id=\"page-container\"]/div/div[1]/form/div[2]/button")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div/header/div/div/div/div/div[3]/a/div")).click();
            Thread.sleep(8000);
            driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[1]/div/div/div/div/div[2]/div[2]/div/div[3]/div/div/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div[2]/div/div/div/div")).sendKeys("hi,this is my second tweet by using selenium");
            driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[1]/div/div/div/div/div[2]/div[2]/div/div[3]/div/div/div[1]/div/div/div/div[2]/div[2]/div/div/div[1]/div[1]/div")).click();
            robot.setAutoDelay(2000);
            StringSelection stringSelection = new StringSelection("/home/admin1/Downloads/images (1).jpeg");
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);
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

        @DataProvider(name="testdata")
        public Object[][] TestDataFeed() throws Exception {
            ReadExcelFile config = new ReadExcelFile("/home/admin1/Desktop/Hemil-linux/SeleniumBasics/src/test/resources/Excel/SetData.xlsx");
            int rows = config.getRowCount(0);
            Object[][] credentials = new Object[rows][2];
            for(int i=0;i<rows;i++)
            {
                credentials[i][0] = config.getData(0, i, 0);
                credentials[i][1] = config.getData(0, i, 1);
            }
            return credentials;
        }
    }

