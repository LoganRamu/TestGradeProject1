package Learning.InterviewQuestions;

public class InheritanceExample
{
     protected void test()
     {
         System.out.println("Base class test");
     }


    public void test1()
    {
        System.out.println("Base class test1");
    }

    public void test2(int a)
    {

    }

    public void test2(int a, int b)
    {

    }
}


class B extends InheritanceExample
{

    @Override
    public void test() {
        super.test();
        System.out.println("child class test");
    }

    @Override
    public void test1() {
        super.test1();
        System.out.println("child class test1");

    }
    public void test2(int a, int c)
    {

    }
}

class C extends B
{
    public static void main(String[] args) {
        B b=new B();
        b.test();
        b.test1();
    }
}