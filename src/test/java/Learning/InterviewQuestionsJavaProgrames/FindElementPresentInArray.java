package Learning.InterviewQuestionsJavaProgrames;

public class FindElementPresentInArray {
    public static void elementPresent() {
        int array[] = {2, 3, 4, 5, 10};
        int present = 7;
        boolean ifPresent = false;

        for (Integer allInts : array) {
            if (allInts == present) {
                /*ifPresent=true;
                System.out.println("Element present");
                break;*/

                ifPresent = true;
                break;
            }

        }
        if (ifPresent) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }
//Foreach
    public static void test1()
    {
        int[] array={1,2,3,4};
        int found=9;
        boolean isPresent=false;

        for (Integer allInts:array) {
            if(allInts==found)
            {
                isPresent=true;
                break;
            }

        }
        if(isPresent)
        {
            System.out.println("yes");
        }else
            System.out.println("no");


    }

    public static void main(String[] args) {
        elementPresent();
        test1();
    }
}

//Using Java 8 we can achieve this is single line