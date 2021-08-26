package Learning.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<String>();
        linkedList.add("Messi");
        linkedList.add("CR7");
        linkedList.add("Neymar");
        linkedList.add("Ibrahim");

        System.out.println(linkedList);

        linkedList.addFirst("Villa");
        linkedList.addLast("David");

        System.out.println(linkedList);

        linkedList.poll();
        System.out.println(linkedList);

        Iterator<String> iterator=linkedList.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}

