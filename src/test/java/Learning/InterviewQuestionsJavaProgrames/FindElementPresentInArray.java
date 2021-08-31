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

    public static void main(String[] args) {
        elementPresent();
    }
}

//Using Java 8 we can achieve this is single line