package Learning.MyLearning;

public class instanceAndthisExample
{
    int c; // Instance variable has default value

    int num()
    {
        return 5;
    }

    void addNumbers(int a, int b)
    {
        int c=10; //local variable, no default value
        System.out.println(a+b+this.c);
        //System.out.println(c);
    }
    public static void main(String args[])
    {
        instanceAndthisExample ls1=new instanceAndthisExample();
        ls1.addNumbers(5,5);


    }
}

//This cannot be called in static method
//local and instance variale same
//to access instance variable