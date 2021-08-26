package Learning.MyLearning;

public class SudhanRef
{
    int x=10;
    int y=20;
    public void me1()
    {
        System.out.println("Test1");
    }
}

class DerivedClass1
{
    public void me2()
    {
        System.out.println("Test2");
    }
}

class De2
{
    public static void main(String[] args) {
        DerivedClass1 obj1=new DerivedClass1();
        obj1.me2();

    }
}
