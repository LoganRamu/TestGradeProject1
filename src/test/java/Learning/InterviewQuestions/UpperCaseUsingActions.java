package Learning.InterviewQuestions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class UpperCaseUsingActions
{
    public static void main(String[] args) throws AWTException {
        Robot robot=new Robot();

        //robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyRelease(KeyEvent.VK_E);
        //robot.keyRelease(KeyEvent.VK_SHIFT);
    }
}
