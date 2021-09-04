package Learning.MyLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.imageio.ImageIO;
import javax.tools.Tool;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class DropDowns
{
    public static void main(String[] args) throws AWTException, IOException {
        WebDriver driver;
        driver=new ChromeDriver();

        driver.get("");
        WebElement ele=driver.findElement(By.xpath(""));

        Select select=new Select(ele);

        String firstSelectedOption = select.getFirstSelectedOption().getText();

        List<WebElement> options = select.getOptions();
        options.get(0).getText();



        StringSelection stringSelection=new StringSelection("file");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        Robot robot=new Robot();

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rectangle=new Rectangle(screenSize);

        BufferedImage screenCapture = robot.createScreenCapture(rectangle);

        File file=new File("Test.png");

        ImageIO.write(screenCapture,"png",file);


        URL url=new URL("https://api.dictionaryapi.dev/api/v2/entries/en/hello");

        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

        httpURLConnection.getResponseCode();

        InputStream inputStream=httpURLConnection.getInputStream();

        InputStreamReader inputStreamReader=new InputStreamReader(inputStream);

        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);

       String line= bufferedReader.readLine();

       StringBuffer stringBuffer=new StringBuffer();

        while(line!=null)
        {
            stringBuffer.append(line);
            break;
            /*System.out.println(line);
            line= bufferedReader.readLine();*/
        }
        System.out.println(stringBuffer);

    }

}
