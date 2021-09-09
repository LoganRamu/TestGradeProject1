package Learning.Maps;

import java.util.*;
import java.util.function.BiConsumer;

public class MapSorting
{

    public static void hashMap()
    {
        //Map no dups based on the key
        /*Map<Integer,String> myMap=new LinkedHashMap<>();

        myMap.put(2,"Banana");
       myMap.put(1,"Apple");
       myMap.put(3,"Cake");
       myMap.put(4,"Apple");

       Iterator iterator=myMap.entrySet().iterator();

       while (iterator.hasNext())
       {
           System.out.println(iterator.next());
       }
*/
        System.out.println("-----------");

        TreeMap<Integer,String> myTreeMap=new TreeMap<>();
        myTreeMap.put(2,"Banana");
        myTreeMap.put(1,"Apple");
        myTreeMap.put(3,"Cake");
        myTreeMap.put(4,"Apple");

        Iterator iterator1=myTreeMap.entrySet().iterator();

        while (iterator1.hasNext())
        {
            System.out.println(iterator1.next());
        }

        System.out.println("--------------");
        TreeMap<Integer,String> myTreeMap1=new TreeMap<>(Collections.reverseOrder());
        myTreeMap1.putAll(myTreeMap);

        //Printed using forloop
        System.out.println("Printed using forloop");
        for (Map.Entry<Integer,String> set:myTreeMap1.entrySet()) {
            System.out.println(set.getKey()+"="+set.getValue());

        }
        //Printed using Iterator
        System.out.println("Printed using Iterator");
        Iterator iterator2=myTreeMap1.entrySet().iterator();

        while (iterator2.hasNext())
        {
            System.out.println(iterator2.next());
        }

        //Printed using Steram
        System.out.println("Printed using Stream");

        myTreeMap1.forEach((key,value)->System.out.println(key+"=="+value));

    }
    public static void main(String[] args) {
        hashMap();
    }
}
