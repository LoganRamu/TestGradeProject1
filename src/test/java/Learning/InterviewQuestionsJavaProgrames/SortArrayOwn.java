package Learning.InterviewQuestionsJavaProgrames;

import java.util.*;

public class SortArrayOwn {

    public static void stringSort() {
        String[] names = {"Cake", "Banana", "Apple", "Banana"};

        List<String> myList = new ArrayList<String>();

        for (String allNames : names) {
            myList.add(allNames);
        }

        myList.forEach(System.out::println);

        System.out.println("-----After Sort-------");
        Collections.sort(myList);
        myList.forEach(System.out::println);
        Collections.sort(myList, Collections.reverseOrder());
        System.out.println("-----After Reverse Sort-------");
        myList.forEach(System.out::println);

        System.out.println("-----After Remove Dups-------");
        Set<String> mySet = new HashSet<String>(myList);

        mySet.forEach(System.out::println);
    }

    public static void numsSort() {
        int[] nums = {10, 40, 30, 50, 20, 20};

        System.out.println("-----After Remove Dups-------");
        Set<Integer> mySet = new HashSet<Integer>();
        for (Integer allNums : nums) {
            mySet.add(allNums);
        }
        mySet.forEach(System.out::println);

        List<Integer> myList = new ArrayList<Integer>(mySet);

        System.out.println("-----After Sort-------");
        Collections.sort(myList);
        myList.forEach(System.out::println);
        Collections.sort(myList, Collections.reverseOrder());
        System.out.println("-----After Reverse Sort-------");
        myList.forEach(System.out::println);
    }

    public static void sortUsingArrayClass()
    {
            String[] names={"BMW","Audi","Carlson","Benz"};

        System.out.println("Before sort");
        for (String allNames:names) {
            System.out.println(allNames);

        }

        Arrays.sort(names);

        System.out.println("After sort");
        for (String allNames:names) {
            System.out.println(allNames);
        }
        Arrays.sort(names,Collections.reverseOrder());
        System.out.println("Descending order sort");

        for (String allNames:names) {
            System.out.println(allNames);
        }
    }

    public static void sortIntUsingArrayClass()
    {
        int[] nums={50,30,10,20,40};

        System.out.println("Before sort");
        for (Integer allNums:nums) {
            System.out.println(allNums);

        }
        Arrays.sort(nums);

        System.out.println("After sort");
        for (Integer allNums:nums) {
            System.out.println(allNums);

       }
        //below logic will not work
        /*Arrays.sort(nums,Collections.reverseOrder());
        System.out.println("Descending order sort");

        for (Integer allNums:nums) {
            System.out.println(allNums);

        }*/
    }

    public static void main(String[] args) {
        /*stringSort();
        numsSort();
        sortUsingArrayClass();*/
        sortIntUsingArrayClass();

    }
}
