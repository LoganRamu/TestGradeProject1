package Learning.ScreenShot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScreenshotUsingRobot
{
    public static void main(String[] args) throws AWTException, IOException {
        WebDriver driver;
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://letcode.in/alert");
        driver.findElement(By.id("accept")).click();
        Robot robot=new Robot();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rectangle=new Rectangle(screenSize);
        BufferedImage source = robot.createScreenCapture(rectangle);

        File destinationFile=new File("RobotCapture.png");
        ImageIO.write(source,"png",destinationFile);
        Alert alert=driver.switchTo().alert();
        alert.accept();
        driver.quit();

    }
}
