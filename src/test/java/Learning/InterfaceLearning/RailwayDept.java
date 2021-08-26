package Learning.InterfaceLearning;

public class RailwayDept implements IndianGovt {
    @Override
    public void normalFund() {

        System.out.println("RailwayNormalfund");
    }
    @Override
    public void emergencyFund() {
        System.out.println("emergencyFund");
    }

    @Override
    public boolean extraFund() {
        return false;
    }

    public void railwayInternalFund()
    {

        System.out.println("railwayInternalFund");
    }
}

