package Learning.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExample
{
    public void listLearning() {
        List<String> myList = new ArrayList<String>();
        myList.add("Banana");
        myList.add("Apple");
        myList.add("Sweetlemon");
        myList.add("JackFruit");
        myList.add("JackFruit");
        myList.add(null);
        myList.remove(0);
        myList.set(1,"GreenApple");
        System.out.println(myList);

        List<String> myList1 = new ArrayList<String>();
        myList1.addAll(myList);
        System.out.println(myList1);
        myList1.clear();

        for (String fruits:myList) {
            System.out.println("Print using foreach---"+fruits);

        }
        for (int i=0;i<myList.size();i++)
        {
            System.out.println("Print using for loop---"+myList.get(i));
            //myList.add("Gova");//throws concurrent modification exception
        }
//Iterdator has only forward
        Iterator<String> iterator=myList.iterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        //List Iterdator has  forward and backward
        ListIterator<String> listIterator=myList.listIterator();

        while(listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }

        while(listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous());
        }


    }

    public static void main(String[] args) {
        ListExample le=new ListExample();
        le.listLearning();

    }
}
