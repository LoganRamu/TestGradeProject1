package Learning.InterviewQuestionsJavaProgrames;

public class ReplaceVowelsWithSpecialChar {

    public static void ReplaceVowelsUsingRegx() {
        String name = "I Love Java";

        name = name.replaceAll("[AEIOUaeiou]", "*");

        System.out.println(name);
    }

    public static void ReplaceVowelsUsingOwnLogic() {
        String name = "Remove vowels";

        char[] charArray = name.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' ||
                    name.charAt(i) == 'o' || name.charAt(i) == 'u') {
                charArray[i] = '$';
            }
        }

        for (Character allChars : charArray) {
            System.out.print(allChars);

        }

    }

    public static void main(String[] args) {
        ReplaceVowelsUsingRegx();
        ReplaceVowelsUsingOwnLogic();
    }
}
