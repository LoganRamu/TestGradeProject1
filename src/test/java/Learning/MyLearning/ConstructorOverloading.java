package Learning.MyLearning;

//Constructor assign values to instance variables;

public class ConstructorOverloading
{
    int a;
    String name;

    public ConstructorOverloading(int a)
    {
        this.a=a;
        //System.out.println(a);

    }

    public ConstructorOverloading(int a, String name)
    {
        this(a);//Object:co1: will chk the whether the single parameter cons available in this class, yes so based
        //on that constructor will assign values.
        this.name=name;
        //System.out.println(a);
        //System.out.println(name);
    }

    void display()
    {
        System.out.println(a);
        System.out.println(name);

    }

    public static void main(String[] args)
    {
        ConstructorOverloading co=new ConstructorOverloading(5);
        co.display();
        ConstructorOverloading co1=new ConstructorOverloading(10,"Logan");
        co1.display();

    }
}
