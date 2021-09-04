package Learning.TryCatchFinally;

public class FinallyDemo
{
    public static void main(String[] args) {
        int a=10;
        int b=5;

        try
        {
            System.out.println(a/b);
        }

        catch (ArithmeticException e)
        {
            System.out.println("Pls chk the number");
        }

        catch (Exception e)
        {
            System.out.println("Super most exception");
        }

        finally {
            System.out.println("Finally executed");
        }


    }
}
