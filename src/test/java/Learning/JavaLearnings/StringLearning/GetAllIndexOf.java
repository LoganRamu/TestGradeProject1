package Learning.JavaLearnings.StringLearning;

public class GetAllIndexOf
{
    public static void main(String[] args) {
        String given="I Love Java";
        String found="a";

        int index=given.indexOf(found);
        while (index>=0)
        {
            System.out.println(index);
            index=given.indexOf(found,index+1);
        }
    }
}
