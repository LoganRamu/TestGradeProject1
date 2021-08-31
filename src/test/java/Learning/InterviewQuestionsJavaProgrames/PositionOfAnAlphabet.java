package Learning.InterviewQuestionsJavaProgrames;

public class PositionOfAnAlphabet {

    //ASCII, 97->a, 65->A

    public static void positionOfLetter() {
        char given = 'z';

        int position = (int) given;
        position = position - 96;
        System.out.println(position);
    }

    public static void main(String[] args) {
        positionOfLetter();
    }
}
