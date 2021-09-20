package Learning.InterviewQuestionsJavaProgrames;

public class FactorialNumber
{
    public static void main(String[] args) {
        int num=5;
        int ans=1;

        for(int i=1;i<=num;i++)
        {
            ans=ans*i;
        }
        System.out.println(ans);
    }
}
