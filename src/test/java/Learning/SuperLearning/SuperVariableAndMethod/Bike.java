package Learning.SuperLearning.SuperVariableAndMethod;

public class Bike extends Vehicle{
    int amt=10000;

    public Bike()
    {

        System.out.println("Constructor from child class");
    }

    public Bike(int number)
    {
        super(number);// or //super(87);
        System.out.println("Bike number--"+number);

    }
    void model()
    {
        super.model();
        System.out.println("Bike model");
        System.out.println("Price--"+amt);
        System.out.println("Vehicle--"+super.amt);//get amt from parent class
    }
}
