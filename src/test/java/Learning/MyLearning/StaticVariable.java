package Learning.MyLearning;

public class StaticVariable
{
    int a=0;
    static int b=0;

    public void incre()
    {
        a=a+1;
        b=b+1;
        System.out.println("Nonstatic --- "+a+" Static-----"+b);
    }
    public static void main(String args[])
    {
        StaticVariable stvar=new StaticVariable();
        stvar.incre();
        stvar.incre();


        //variable belongs to class
        //not belongs to object

        StaticVariable stvar1=new StaticVariable();
        stvar1.incre();
        stvar1.incre();
    }
}

//variable belongs to class
//not belongs to object