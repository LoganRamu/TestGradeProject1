package Learning.Collections;

import java.util.*;

public class SetExample {
    public static void hashSet(){

        //No order qurantied
        //No dups
        Set<String> mySet=new LinkedHashSet<>();
        mySet.add("Cake");
        mySet.add("Banana");
        mySet.add("Apple");
        mySet.add("Banana");
        mySet.add(null);


        mySet.forEach(System.out::println);

        mySet.remove("Banana");

        System.out.println("After remove");
        mySet.forEach(System.out::println);

        Iterator iterator=mySet.iterator();

        List<String> myList=new ArrayList<>(mySet);

        //Reverse Logic
        /*for(int i=myList.size()-1;i>=0;i--)
        {
            System.out.println(myList.get(i));
        }*/


       /* for (String all:mySet) {



        }*/

        ListIterator listIterator=myList.listIterator();

        System.out.println("-------------");
        while (listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }

}

    public static void main(String[] args) {
        hashSet();
    }



}
