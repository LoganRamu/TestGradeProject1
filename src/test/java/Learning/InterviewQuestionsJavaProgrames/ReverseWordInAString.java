package Learning.InterviewQuestionsJavaProgrames;

public class ReverseWordInAString {

    public static void  reverseWord()
    {
        String name="I am Logan";

        String[] allWords = name.split(" ");

        String reversed="";

        for(int i=allWords.length-1;i>=0;i--)
        {
           // reversed=reversed+allWords[i];
            System.out.print(allWords[i]+" ");
        }

        //System.out.println(reversed+" ");
    }
    public static void main(String[] args) {
        reverseWord();
    }
}
