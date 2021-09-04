package Learning.SudhanDemo;

public class StaticClassDemo
{
    static class InnerClass1
    {
       public  void InnerMethod1()
        {
            System.out.println("InnerClass1");
        }
    }

    public static void main(String[] args) {
        //StaticClassDemo.InnerClass1=new StaticClassDemo.InnerClass1();


    }
}

//Above is not possible at all
//To simulate the private inner class

