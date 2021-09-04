package Learning.JavaLearnings.StringLearning;

public class StringDemo {
    public static void main(String[] args) {
        String name = "Logu";
        name = "Logan";
        System.out.println(name);

        String name1 = "College";
        String find = "l";
        int index = name1.indexOf(find);

        while (index >= 0) {

            System.out.println(index);
            index = name1.indexOf(find, index + 1);
        }
    }
}

/*
Ex: String immutable
        String name="Logu";
        name="Logan";
        sout(name);
        Result: Logan;
        We assume that Logu is overriden by Logan
        But not, that String name is pointed to Logan now, so Logu is eligible for GC*/
