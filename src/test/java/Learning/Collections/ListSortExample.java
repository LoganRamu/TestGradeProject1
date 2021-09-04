package Learning.Collections;

import java.util.*;

public class ListSortExample {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<String>();

        myList.add("Apple");
        myList.add("Banana");
        myList.add("Cat");
        myList.add("Banana");

        System.out.println("New List");
        myList.forEach(System.out::println);

        System.out.println(myList.get(0));
     myList.remove("Banana"); //removed the first appearance

        System.out.println("Modified List");
        myList.forEach(System.out::println);


        Collections.sort(myList);
        System.out.println("---------------");
        myList.forEach(System.out::println);

        Collections.sort(myList,Collections.reverseOrder());//descending order

        System.out.println("---------------");
        myList.forEach(System.out::println);

        System.out.println("-------------");

        Set<Integer> mySet=new HashSet<Integer>();

        mySet.add(3);
        mySet.add(2);
        mySet.add(5);
        mySet.add(1);
        mySet.add(4);
        mySet.add(4);

        mySet.remove(2);

        for (Integer allInts:mySet) {
            System.out.println(allInts);

        }







    }
}
