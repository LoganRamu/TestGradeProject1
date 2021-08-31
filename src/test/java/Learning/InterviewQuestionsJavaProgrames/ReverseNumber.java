package Learning.InterviewQuestionsJavaProgrames;

public class ReverseNumber {

    /*Only Logic/Formula:
    reversed=reversed*10;
    reversed=reversed+giver%10;
    given=given/10;
    * */
    public static void reverseNum() {

        int given = 1234;
        int reversed = 0;

        while (given != 0) {

            reversed = reversed * 10;
            reversed = reversed + given % 10;
            given = given / 10;

        }
        System.out.println(reversed);
    }

    public static void main(String[] args) {
        reverseNum();
    }
}
