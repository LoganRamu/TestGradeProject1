package Learning.InterfaceLearning;

public class Citizen {
    public static void main(String args[])
    {
        RailwayDept railwayDept=new RailwayDept();
        railwayDept.normalFund();
        railwayDept.emergencyFund();
       boolean ef= railwayDept.extraFund();
        System.out.println(ef);
        railwayDept.railwayInternalFund();
        System.out.println("TotdalFund"+RailwayDept.totdalBudget);

        HighWayDept highWayDept=new HighWayDept();
        highWayDept.normalFund();
        highWayDept.emergencyFund();
        boolean ef1=highWayDept.extraFund();
        System.out.println(ef1);

        //For Interface we have only Reference variables, no constructor
        IndianGovt indianGovt=new RailwayDept();
        indianGovt.defaultFund();
        IndianGovt.staticFund();

        AbsHealthChennai absHealthChennai=new AbsHealthChennai();
        absHealthChennai.emergencyFund();
        absHealthChennai.normalFund();




    }
}
