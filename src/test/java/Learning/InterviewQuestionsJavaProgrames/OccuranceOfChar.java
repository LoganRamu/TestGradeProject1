package Learning.InterviewQuestionsJavaProgrames;

public class OccuranceOfChar
{
    public static void occuranceChar()
    {
        String name="Loganathan";

        char found='a';

        int ocurances=0;

        name=name.toLowerCase();

        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)==found)
            {
                ocurances++;
            }
        }
        System.out.println(ocurances);
    }

    public static void main(String[] args) {
        occuranceChar();
    }
}
