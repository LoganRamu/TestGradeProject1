package Learning.InterviewQuestionsJavaProgrames.RemoveDupsFromArray;

public class RemoveDupsfromIntArrayUsingLogic {
    public static void intArrayUsingLogic() {
        int[] num = {2, 1, 3, 2, 5, 3};
        //Out expect: 2,1,3,5;
        //Need two loops
        //need one counter

        for (int i = 0; i < num.length; i++) {
            int counter = 0;
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    counter++;
                }
            }
            if (counter == 0) {
                System.out.println(num[i]);
            }
        }
    }

    public static void stringArrayUsingLogic() {
        String[] names = {"Cake", "Apple", "Banana", "Apple"};


        for (int i = 0; i < names.length; i++) {
            int counter = 0;
            for (int j = i + 1; j < names.length; j++) {
                if (names[i] == names[j]) {
                    counter++;
                }
            }
            if (counter == 0) {
                System.out.println(names[i]);
            }
        }
    }

    public static void main(String[] args) {
        //intArrayUsingLogic();
        stringArrayUsingLogic();
    }
}
