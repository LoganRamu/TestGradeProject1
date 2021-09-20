package Learning.InterviewQuestionsJavaProgrames.Recursive;

public class ReverseString {
    public static String reverse(String a) {
        if (a.length() <= 1) {
            return a;
        }

        return reverse(a.substring(1)) + a.charAt(0);
    }

    public static void main(String[] args) {
        String name = "Logan";
        System.out.println(reverse(name));
    }
}
