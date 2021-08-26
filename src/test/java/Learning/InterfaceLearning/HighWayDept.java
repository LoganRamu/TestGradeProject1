package Learning.InterfaceLearning;

public class HighWayDept implements IndianGovt{
    @Override
    public void normalFund() {
        System.out.println("HighWayDeptnormalFund");
    }

    @Override
    public void emergencyFund() {
        System.out.println("HighWayDeptemergencyFund");

    }

    @Override
    public boolean extraFund() {
        return true;
    }
}
