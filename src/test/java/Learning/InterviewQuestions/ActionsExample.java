package Learning.InterviewQuestions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExample {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        Actions actions=new Actions(driver);
        actions.keyDown(Keys.chord(Keys.CONTROL,"a"));
        actions.sendKeys();
    }
}
