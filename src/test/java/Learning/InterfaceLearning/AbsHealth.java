package Learning.InterfaceLearning;

//abstract cla  dint have constructor, not possible to create object
public abstract class AbsHealth implements IndianGovt{

    @Override
    public void emergencyFund() {
        System.out.println("emergencyFundAbsHealth");
    }

    @Override
    public boolean extraFund() {
        return true;
    }
}

//We cannot created obj for abs class
//Since abs class in incomplete
//Funny: Kudutha velaya olunga seyala unaku object oru keda