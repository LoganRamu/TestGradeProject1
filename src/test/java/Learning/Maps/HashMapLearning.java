package Learning.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapLearning {
    public static void  main(String args[]) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1,"Tiago");
        hashMap.put(2,"Altroz");
        hashMap.put(3,"Nexon");
        hashMap.put(4,"Hexon");
        hashMap.put(4,"Safari");
        hashMap.put(null,"");
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
