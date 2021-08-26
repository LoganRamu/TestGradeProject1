package Learning.SuperLearning.SuperVariableAndMethod;

public class Vehicle {
    int amt=50000;

    public Vehicle()
    {
        System.out.println("Constructor from parent class");
    }

    public Vehicle(int number)
    {
        System.out.println("Vechi number--"+number);

    }

    void model()
    {
        System.out.println("Parent Vehicle model");
    }
    void test()
    {

    }
}
