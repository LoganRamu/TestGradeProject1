package Learning.InterviewQuestionsJavaProgrames;

public class RemoveSpacesFromString
{

    public static void removeUsingTrim()
    {
        String name=" Testing spaces ";
        System.out.println(name);
        name=name.trim();
        System.out.println(name);
    }

    public static void removeUsingStrip()
    {
        //From Java 11 we ahve this Strip method
        String name=" Testing spaces ";
        //name=name.stripLeading();//Remove from front
        //name=name.stripTrailing();//Remove from tail
        name=name.strip();
        System.out.println(name);
    }

    public static void removeUsingRegx()//Imp concept
    {
        /*1. ^[ \t]+|[ \t]+$ - remove from front and trail
        2. ^[ \t]+ - Remove from front
        3. [ \t]+$ - Remove from train
        * */
        String name=" Testing spaces ";

        name=name.replaceAll("^[ \t]+|[ \t]+$","");

        System.out.println(name);
    }


    public static void main(String[] args) {
        removeUsingTrim();
        removeUsingStrip();
        removeUsingRegx();
    }
}
