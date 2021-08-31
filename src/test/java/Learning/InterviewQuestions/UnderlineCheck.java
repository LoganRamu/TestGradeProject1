package Learning.InterviewQuestions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UnderlineCheck {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.location='https://www.google.com/'");
        WebElement link1 = driver.findElement(By.linkText("Gmail"));

        String beforeUnderline = link1.getCssValue("text-decoration");
        System.out.println(beforeUnderline);

        if (beforeUnderline.indexOf("underline") == 0) {
            System.out.println("Text Underlined");
        } else {
            System.out.println("Text not Underlined");
        }

        Actions actions = new Actions(driver);
        actions.moveToElement(link1).perform();

        String afterUnderline = link1.getCssValue("text-decoration");
        System.out.println(afterUnderline);

        if (afterUnderline.indexOf("underline") == 0) {
            System.out.println("Text Underlined");
        } else {
            System.out.println("Text not Underlined");
        }

    }

}
