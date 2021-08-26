package Learning.AccessModifiers;

public class DefaultBase {
    void BankChennai()
    {
        System.out.println("Enquire");
    }

    public static void main(String[] args) {
        DefaultBase defaultBase=new DefaultBase();
        defaultBase.BankChennai();
    }
}
