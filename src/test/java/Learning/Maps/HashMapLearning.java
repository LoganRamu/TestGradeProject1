package Learning.Maps;

import java.util.*;

public class HashMapLearning {
    public static void  main(String args[]) {
       TreeMap<Integer, String> hashMap = new TreeMap<Integer, String>();

        //To sort map, have to store it in Tree map- ascending
        //For descending use below method

        //TreeMap<Integer, String> hashMap = new TreeMap<Integer, String>(Collections.reverseOrder());
        hashMap.put(1,"Tiago");
        hashMap.put(2,"Altroz");
        hashMap.put(3,"Nexon");
        hashMap.put(4,"Hexon");
        hashMap.put(4,"Safari");
        hashMap.put(6,null);
        hashMap.put(7,null);
        hashMap.put(5,"Test");
        System.out.println("Get1----"+hashMap.get(1));
        System.out.println("HashMap Size----"+hashMap.size());



        //Map doesn't ahve Iterator
       Set se=hashMap.entrySet();

        Iterator it=se.iterator();

        while (it.hasNext())
        {
            System.out.println(it.next());

        }





    }
}
