package Learning.InterviewQuestionsJavaProgrames;

public class PrimeNumbers
{
    public static void main(String[] args) {

        /*Logic:Nume 7 , take 2 to 6 chk all numbers divide by 7
        if remaining 0 then counter ++;,
        if cunter =0 the the number is prime
        * */

        int num=8;
        int perform;
        int counter=0;

        for(int i=2;i<num;i++)
        {
            perform=num%i;
            if(perform==0)
            counter++;
        }
        if(counter==0)
        {
            System.out.println("Prime");
        }else
            System.out.println("not Prime");
    }
}
