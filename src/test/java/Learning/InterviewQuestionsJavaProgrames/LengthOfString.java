package Learning.InterviewQuestionsJavaProgrames;

public class LengthOfString {

    public static void defaultMethod() {
        String name = "Logan";
        System.out.println(name.length());
    }

    public static void ownLogic()
    {
        String name = "Java";
        char[] charArray = name.toCharArray();
        int len=0;

        for (Character allChars:charArray) {

            len++;
        }
        System.out.println(len);
    }

    public static void main(String[] args) {
        defaultMethod();
        ownLogic();
    }
}
