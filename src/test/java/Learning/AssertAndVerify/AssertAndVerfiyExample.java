package Learning.AssertAndVerify;

import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import org.assertj.core.api.SoftAssertions;

public class AssertAndVerfiyExample
{

    /*public void Assert()
    {
        System.out.println("Before Assert");
        //Junit Assert
        Assert.assertEquals("Test1","Test2");
        System.out.println("After Assert");
    }*/
    //Need more work on below ot Junit Verify
    /*public void Verify()
    {
        System.out.println("Before Assert");
        //Junit Verify (SoftAssert)
        SoftAssertions softAssertions=new SoftAssertions();
        softAssertions.assertThat("","");
        Assert.assertEquals("Test1","Test2");
        System.out.println("After Assert");
    }
*/
    //TestNg Verify
    public static void TestNGVerify()
    {
        System.out.println("Before Assert");
        //Junit Verify (SoftAssert)
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals("Test1","Test2");
        System.out.println("After Assert");
    }
    public static void main(String[] args) {

        TestNGVerify();
    }
}
