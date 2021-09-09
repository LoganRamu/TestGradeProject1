package Learning.InterviewQuestionsJavaProgrames;

public class OccuranceOfChar
{
    public static void occuranceChar()
    {
        String name="Loganathan";

        char found='g';


        int ocurances=0;
        int positionAlphabet=0;

        name=name.toLowerCase();

        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)==found)
            {
                ocurances++;
                positionAlphabet=(int) found;
                positionAlphabet=positionAlphabet-96;
            }
        }
        System.out.println(positionAlphabet);
        System.out.println(ocurances);
    }

    public static void main(String[] args) {
        occuranceChar();
    }
}
