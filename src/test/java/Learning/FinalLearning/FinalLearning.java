package Learning.FinalLearning;

final class FinalLearning {

    final void test()
    {
        System.out.println("Test1");
    }

    final void test(int a)
    {
        System.out.println(a+5);
    }

    public static void main(String[] args) {

        FinalLearning finalLearning=new FinalLearning();
        finalLearning.test();
        finalLearning.test(5);

    }
}

