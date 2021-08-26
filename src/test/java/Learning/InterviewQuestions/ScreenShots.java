package Learning.InterviewQuestions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScreenShots
{
    public static void main(String[] args) throws IOException, AWTException {
        WebDriver driver=new ChromeDriver();
        driver.get("");
        TakesScreenshot takesScreenshot= (TakesScreenshot) driver;
        File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File file=new File("Test.png");
        FileHandler.copy(sourceFile,file);

        Robot robot=new Robot();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rectangle=new Rectangle(screenSize);

        BufferedImage screenCapture = robot.createScreenCapture(rectangle);
        File fil=new File("Test11.png");
        ImageIO.write(screenCapture,"png",fil);

    }
}
