package Learning.FinalLearning;

final class FinalLearning {
    final int a=10;
    final void test()
    {
        System.out.println("Test1");
    }

    final void test(int a)
    {
        System.out.println(a+5);
    }
private void test1()
{
    System.out.println("Private");
}

private void test1(int d)
{

}
    public static void main(String[] args) {

        FinalLearning finalLearning=new FinalLearning();
        finalLearning.test();
        finalLearning.test(5);
        finalLearning.test1();
        finalLearning.test(5);
    }
}

