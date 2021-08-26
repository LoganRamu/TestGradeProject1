package Learning.MyLearning;

public class ConstructorLearning
{
    //Default & Parameter Constructor

    /*public ConstructorLearning()
    {
        this.a=5;
        this.name="hjhjh";
    }*/
    int a;
    String name;
    public ConstructorLearning(int a, String name)
    {
        this.a=a;
        this.name=name;
    }

    //Can be overloaded
    public ConstructorLearning(int a)
    {
        this.a=a;

    }

    void print()
    {
        System.out.println(a+"....."+name);
    }
    public static void main(String args[])
    {
        ConstructorLearning cons=new ConstructorLearning(5,"Test");
        ConstructorLearning cons1=new ConstructorLearning(10);
        cons.print();
        cons1.print();
    }

}

//No return type
//Default & Parameter Constructor
//Can be overloaded
//Instance variable's default value set by Constructor

