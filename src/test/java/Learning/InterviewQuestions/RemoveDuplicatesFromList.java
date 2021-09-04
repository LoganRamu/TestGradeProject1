package Learning.InterviewQuestions;

import java.util.*;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        List<String> myList1 = new ArrayList<String>();
        myList1.add("Tiago");
        myList1.add("Altroz");
        myList1.add("Altroz");
        myList1.add(null);



        //Below are streaming type of print from Java 8
        //myList1.forEach(i-> System.out.println(i));


        //Approach 1, Using 2nd List

        /*System.out.println("After Removed dups");
        List<String> myList2=new ArrayList<String>();

        for(String myList1Data:myList1)
        {
            if(!myList2.contains(myList1Data))
            {
                myList2.add(myList1Data);
            }

        }
        for (String myList2Data:myList2) {
            System.out.println(myList2Data);
        }*/

        //Approach 2: using Set will remove dups
        Set<String> mySet = new HashSet<String>();
        mySet.addAll(myList1);
        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
