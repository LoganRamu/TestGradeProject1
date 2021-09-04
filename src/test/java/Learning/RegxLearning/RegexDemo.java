package Learning.RegxLearning;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        String name="text here text";
        //Pattern pattern=new Pattern();
        /*Above is not possible, because Pattern class constructor is private constructor using singleton design pattern
        * */


            Pattern pattern=Pattern.compile("text");
            Matcher matcher= pattern.matcher(name);

            while(matcher.find()) {
                System.out.println(matcher.group());



            }
            }
}
