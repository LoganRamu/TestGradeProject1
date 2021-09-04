package Learning.InterviewQuestionsJavaProgrames.SortingProgrammes;

import java.util.Arrays;

public class SortIntUsingArraysClass {
    public static void sortIntUsingArrayClass() {
        int[] nums = {5, 3, 4, 2, 1};

        //sort in descending order, 1st have to sort it in order

        Arrays.sort(nums);
        System.out.println("After sort");
        for (Integer allNums : nums) {
            System.out.println(allNums);
        }

        //Swap the position of array
        System.out.println("Descending order");
        for (int i = nums.length - 1; i > 0; i--) {
            System.out.println(nums[i]);
        }

    }

    public static void main(String[] args) {
        sortIntUsingArrayClass();
    }
}
