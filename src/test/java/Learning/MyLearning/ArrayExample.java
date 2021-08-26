package Learning.MyLearning;

import java.util.Arrays;

public class ArrayExample
{
    void arrExample()
    {
        String[] test={"val1","val2", "Val3"};
        System.out.println(test[0]);
        System.out.println(test.length);
        System.out.println(test[test.length-1]);
        System.out.println(test);
        System.out.println(Arrays.toString(test));

        //otr way to print all
        for(String str:test)
        {
            System.out.println(str);
        }
    }




    public static void main(String args[])
    {
        ArrayExample arrex=new ArrayExample();
        arrex.arrExample();
    }
}
