package Learning.InterviewQuestionsJavaProgrames;

public class OccurenceOfWordInSentence
{
    public static void main(String[] args) {
        String name="hai dood hai";
        String found="hai";

        int occurance=0;

        String[] words = name.split(" ");

        for(String allWords:words)
        {
            if(allWords.equals(found))
            {
                occurance++;
            }
        }

        System.out.println(occurance);


    }
}
