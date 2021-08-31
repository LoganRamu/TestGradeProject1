package Learning.InterfaceLearning;
//interface have only abstract method
//Dont have function body

public interface IndianGovt {
    int totdalBudget=100000;

    void normalFund();

     void emergencyFund();


    boolean extraFund();

    //From Java 8 we have additional stuffs
    //default and static: can have function body

    default void defaultFund()
    {
        System.out.println("Java 8 default");
    }

    static void staticFund()
    {
        System.out.println("Java 8 static");
    }

}

//All the methods are abs
//All the variables are public static, final
//Marker interface /empty interface-No implementation
