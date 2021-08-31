package Learning.JavaLearnings.StringLearning;

public class StringDeclaration {

    public static boolean literalMethod() {
        String name = "Logan";
        String name1 = "Logan";

        if (name == name1)
            return true;
        else
            return false;
    }

    public static boolean stringBufferMethod() {
        StringBuffer name = new StringBuffer("Logan");
        StringBuffer name1 = new StringBuffer("Logan");

        if (name.toString().equals(name1.toString()))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(literalMethod());
        System.out.println(stringBufferMethod());


    }
}
