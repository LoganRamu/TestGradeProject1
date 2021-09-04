package Learning.MyLearning;

import java.util.*;

public class ListAndSet {


        //List: order, no null values
        //Duplicate allow
        //List<int> not working;
        //List<Integer> not working;
        //Change the size at run time

        public static void listLearning()
        {
        List<String> myList=new ArrayList<>();
        myList.add("four");
        myList.add("one");
        myList.add("two");
        myList.add("three");
        myList.add("four");
        myList.add("four");

        //myList.add("");
        boolean empty=myList.isEmpty();
            System.out.println("isEmpty---"+empty);
        //if need to sort can use Collections
        Collections.sort(myList);
        int size=myList.size();
        System.out.println(size);
        for (String str:myList)
        {
            System.out.println(str);
        }
            myList.remove(0);
            System.out.println("After Remove");
            for (String str1:myList)
            {
                System.out.println(str1);
        }
            myList.clear();

     }
     //Set
     public void setLearning()
     //Set no duplicate values
     //Order: based on the implemented class
     //no get
     //if need we have to use Link inside Set
     {
         Set<String> mySet = new LinkedHashSet<>();
         mySet.add("Tiago");
         mySet.add("Nexon");
         mySet.add("Altroz");
         mySet.add("Hexon");
         mySet.add("safari");
         mySet.add("Tiago");

         boolean empty=mySet.isEmpty();
         System.out.println("isEmpty---"+empty);
         //if need to sort can use Collections
         //Collections.sort(mySet);//Only usable in List not is set
         int size=mySet.size();
         System.out.println(size);
         for (String str : mySet) {
             System.out.println(str);
         }
         mySet.remove("safari");//Cant use index remove in Set

         for (String str1:mySet)
         {
             System.out.println(str1);
         }

         List<String> myList=new ArrayList<>(mySet);
         System.out.println("Set Print in List---"+myList.get(0));
         Iterator it=mySet.iterator();
         while(it.hasNext())
         {
             if(it.next().equals("safari"))
             {
                it.remove();
             }
             System.out.println("Print using Iterator"+it.next());
         }



     }


    public static void main (String args[])
    {
        listLearning();
        ListAndSet listAndSet=new ListAndSet();
        listAndSet.setLearning();
}}
