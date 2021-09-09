package Learning.InterviewQuestionsJavaProgrames;

import java.util.*;

public class ReverseString {

    public static void reverseUsingStringBuffer() {
        //Approach 1: we can use String buffer to reverse method, we don't have reverse method in String
        String name = "Logan";
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(name);
        System.out.println(stringBuffer.reverse());
    }

    public static void reverseUsingOwnLogic() {
        //Approach 2: Own logic
        /*1. Convert String into charArray for reverse
        2. Then start from loop. starts from the last position
        * */

        String name = "Java";
        char[] charArray = name.toCharArray();
        String reversedName = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversedName = reversedName + charArray[i];
            //System.out.println(charArray[i]);
        }
        System.out.println(reversedName);
    }

    public static void reverseIntOwnLogic() {
        //Approach3:  using Collections

        int number = 9876;
        String numToStr=Integer.toString(number);
        String reversedName = "";
        char[] charArray = numToStr.toCharArray();
        for(int i=charArray.length-1;i>=0;i--)
        {
            reversedName=reversedName+charArray[i];
            //System.out.println(charArray[i]);
        }
        System.out.println(reversedName);
    }

    public static void reverseUsingCollections() {
        //Approach3:  using Collections

        String name = "Selenium";
        String reversedName = "";
        char[] charArray = name.toCharArray();
        List<Character> characterList = new ArrayList<Character>();

        for (Character allChars : charArray) {
            characterList.add(allChars);
        }
        Collections.reverse(characterList);

        Iterator iterator = characterList.iterator();

        while (iterator.hasNext()) {
            reversedName = reversedName + iterator.next();
            //System.out.println(iterator.next());
        }
        System.out.println(reversedName);
    }

    public static void intReverseUsingCollections() {
        //Approach3:  using Collections

        int number = 2345;
        String numToStr=Integer.toString(number);
        String reversedName = "";
        char[] charArray = numToStr.toCharArray();
        List<Character> characterList = new ArrayList<Character>();

        for (Character allChars : charArray) {
            characterList.add(allChars);
        }
        Collections.reverse(characterList);

        Iterator iterator = characterList.iterator();

        while (iterator.hasNext()) {
            reversedName = reversedName + iterator.next();
            //System.out.println(iterator.next());
        }
        System.out.println(reversedName);
    }

    public static void main(String[] args) {
        /*reverseUsingStringBuffer();
        reverseUsingOwnLogic();
        reverseUsingCollections();*/
        //intReverseUsingCollections();
        reverseIntOwnLogic();


    }
}


//https://cscircles.cemc.uwaterloo.ca/java_visualize/