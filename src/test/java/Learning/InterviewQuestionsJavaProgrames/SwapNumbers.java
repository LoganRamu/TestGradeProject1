package Learning.InterviewQuestionsJavaProgrames;

public class SwapNumbers {
    public static void swapUsingTemp() {
        int a = 5;
        int b = 10;
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("A--" + a);
        System.out.println("B--" + b);
    }

    public static void swapWithoutTempAddition() {
        int a = 5;
        int b = 10;
        a = a - b;
        b = a + b;
        a = b - a;
        System.out.println("A--" + a);
        System.out.println("B--" + b);
    }

    public static void swapWithoutTempMul() {
        int a = 5;
        int b = 10;
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("A--" + a);
        System.out.println("B--" + b);
    }

    public static void main(String[] args) {

        swapUsingTemp();
        swapWithoutTempAddition();
        swapWithoutTempMul();
    }
}
