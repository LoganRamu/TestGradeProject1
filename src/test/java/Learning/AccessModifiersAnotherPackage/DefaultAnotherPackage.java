package Learning.AccessModifiersAnotherPackage;

import Learning.AccessModifiers.DefaultBase;

public class DefaultAnotherPackage
{
    public static void main(String[] args) {
        DefaultBase defaultBase=new DefaultBase();
        //Not accessible since default only can be accessible with in the package
    }
}
