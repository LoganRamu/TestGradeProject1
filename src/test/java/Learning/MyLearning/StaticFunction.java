package Learning.MyLearning;

public class StaticFunction
{
    public static void set()
    {
        System.out.println("Testing");

    }
    public static void main(String args[])
    {
       // StaticFunction stfn=new StaticFunction();
        //static function can be called without object
        set();
    }
}
//static function can be called without object
//Same class: function name itself enough
//otr class means StaticFunction.set()
//No object need to call the function if its declared with Static
//Inside static function we cannot call non static variable
//But Static variable can be called Inside the non static function