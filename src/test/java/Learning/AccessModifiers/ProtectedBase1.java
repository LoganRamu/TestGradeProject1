package Learning.AccessModifiers;

public class ProtectedBase1 extends ProtectedBase
{
     public static void Dog()
    {

        System.out.println("Dog");
    }
    public static void main(String[] args) {
        ProtectedBase protectedBase=new ProtectedBase();
        ProtectedBase.Animal();
        ProtectedBase1 protectedBase1=new ProtectedBase1();
        ProtectedBase1.Dog();

    }

    }

