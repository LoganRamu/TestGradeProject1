package Learning.InterviewQuestionsJavaProgrames;

import java.util.ArrayList;
import java.util.List;

public class ListToStringArray {

    public static void listToStringDemo()
    {
        List<String> myList = new ArrayList<>();
        myList.add("Banana");
        myList.add("Apple");
        myList.add("Cake");

        String[] stringArray = new String[myList.size()];
        /*The below should work only for Non primitive(Reference types)
        String....
        For int
         */
        myList.toArray(stringArray);

        for (String allNames : stringArray) {
            System.out.println(allNames);
    }}
    public static void listToIntDemo()
    {
        List<Integer> myList = new ArrayList<>();
        myList.add(5);
        myList.add(4);
        myList.add(7);

        int[] intArray = new int[myList.size()];
        // myList.toArray(intArray);this line will show compile time error

        for(int i=0;i<myList.size();i++)
        {
            intArray[i]=myList.get(i);
        }

        for (Integer allNums : intArray) {
            System.out.println(allNums);
        }}

    public static void main(String[] args) {

        listToStringDemo();
        listToIntDemo();
        }
    }

