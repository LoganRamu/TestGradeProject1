package Learning.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDupsFromList {
    public static void removeUsingSet() {
        List<String> myList = new ArrayList<>();

        myList.add("Java");
        myList.add("Python");
        myList.add("C++");
        myList.add("AJAX");
        myList.add("Java");

        myList.forEach(System.out::println);
        System.out.println("-------------");
        Set<String> mySet = new HashSet<>(myList);
        mySet.forEach(System.out::println);

    }

    public static void removeUsingAnotherList() {
        List<String> myList = new ArrayList<>();

        myList.add("Java");
        myList.add("Python");
        myList.add("C++");
        myList.add("AJAX");
        myList.add("Java");

        List<String> myNewList = new ArrayList<>();

        for (String allValues : myList) {
            if(!myNewList.contains(allValues))
            {
                myNewList.add(allValues);
            }
        }

        System.out.println("----------");
        myNewList.forEach(System.out::println);

    }

    public static void main(String[] args) {
        //removeUsingSet();
        removeUsingAnotherList();
    }
}
