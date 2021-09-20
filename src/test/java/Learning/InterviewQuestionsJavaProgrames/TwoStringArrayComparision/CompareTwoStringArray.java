package Learning.InterviewQuestionsJavaProgrames.TwoStringArrayComparision;

import java.util.Arrays;

public class CompareTwoStringArray
{

    public static boolean compare(Object[] array1, Object[] array2)
    {
        if(array1.length!=array2.length)
        {
            return false;
        }
        for (int i=0;i<array1.length;i++)
        {
            if(array1[i]!=(array2[i]))
            {
                return false;
            }
        }
        return true;
   }

    public static void main(String[] args) {
        String[] array1={"Banana","Cake","Apple"};
        for (String allValues:array1) {
            System.out.println(allValues);
        }
        String[] array2={"Apple","Cake","Banana"};
        Arrays.sort(array1);
        Arrays.sort(array2);

        /*int[] a={2,3,4,5};
        int[] b={2,3,4,5};*/

        /*Rules:
         Both array should be in same length,
         same sort type
        * */
        boolean result=compare(array1,array2);

        if(result)
        {
            System.out.println("Equal");
        }else
            System.out.println("Not Equal");

    }
}
