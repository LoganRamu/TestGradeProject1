package Learning.InterviewQuestionsJavaProgrames;

public class SmallestNumberInArray {
    public static void smallerNum() {
        int array[] = {2, 3, 4, 5};

        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        System.out.println(smallest);

    }

    public static void maxNum() {
        int array[] = {10, 100, 500, 50};

        int maximum = Integer.MIN_VALUE;

        for (Integer allInts : array) {

            if (allInts > maximum) {
                maximum = allInts;
            }
        }
        System.out.println(maximum);
    }

    public static void secondLargest() {
        int array[] = {35, 45, 55, 100};
        int maximum = 0;
        int second_Max = 0;

        for (Integer allInts : array) {

            if (allInts > maximum)
                maximum = allInts;
            if (allInts > second_Max && second_Max != maximum)
                second_Max = allInts;
        }
        System.out.println("Maximum--" + maximum);
        System.out.println("Second_Max--" + second_Max);
    }

    public static void main(String[] args) {
        smallerNum();
        maxNum();
        secondLargest();
    }
}
