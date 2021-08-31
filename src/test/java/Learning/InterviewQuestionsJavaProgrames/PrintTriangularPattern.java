package Learning.InterviewQuestionsJavaProgrames;

public class PrintTriangularPattern {

    public static void printSpecialChars() {
        int limit = 5;
        int i = 0;
        int j = 0;

        for (i = 0; i < limit; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printNumbers()
    {
        int startNumber=1;
        int limit=5;
        int i = 0;
        int j = 0;

        for(i=0;i<limit;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(startNumber+" ");
                startNumber++;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        printSpecialChars();
        printNumbers();
    }
}
