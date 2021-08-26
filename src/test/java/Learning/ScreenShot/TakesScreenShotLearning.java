package Learning.ScreenShot;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class TakesScreenShotLearning {

    public static void getFullScreenshot(WebDriver driver)
    {
        driver.get("https://letcode.in/alert");
    }


    public static void main(String[] args) throws IOException, AWTException {
        WebDriver driver;
        driver=new ChromeDriver();
        TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
        File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destFile=new File("ScreenSht.png");
        FileHandler.copy(sourceFile,destFile);
        getFullScreenshot(driver);
        driver.quit();

    }
}

