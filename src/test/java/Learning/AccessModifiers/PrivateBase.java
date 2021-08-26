package Learning.AccessModifiers;

public class PrivateBase {
    private void ManagerSalary()
    {
        System.out.println("Manager Salary"+10000);
    }
    private void EmployeeDetails()
    {
        System.out.println("EmployeeDetails");
    }

    public static void main(String[] args) {
        PrivateBase privateBase=new PrivateBase();
        privateBase.EmployeeDetails();
        privateBase.ManagerSalary();
    }
}

