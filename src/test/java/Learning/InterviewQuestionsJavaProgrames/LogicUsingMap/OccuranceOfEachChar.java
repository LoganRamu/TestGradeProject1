package Learning.InterviewQuestionsJavaProgrames.LogicUsingMap;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfEachChar
{
    public static void main(String[] args) {
        String name="Loganathan test";
        // J-1, a-2, v-1

        char[] charArray=name.toCharArray();

        Map<Character,Integer> mapValues=new HashMap<>();

        for(char ch:charArray)
        {
            if(mapValues.containsKey(ch))
            {
                mapValues.put(ch,mapValues.get(ch)+1);
            }
            else
                mapValues.put(ch,1);
        }
        System.out.println(mapValues.keySet()+"="+mapValues.values());
    }
}
