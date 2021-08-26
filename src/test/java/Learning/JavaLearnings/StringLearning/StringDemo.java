package Learning.JavaLearnings.StringLearning;

public class StringDemo
{
    public static void main(String[] args) {
        String name="Logu";
        name="Logan";
        System.out.println(name);
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
