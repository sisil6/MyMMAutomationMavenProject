package BasicTests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTests {
    int a;
    int b;
    @Parameters({"a", "b"})
    @Test()
    public void softAssertionTest(int a, int b){
        int sum = a + b;
        System.out.println("The sum of both parameters is:" + sum);
        SoftAssert myAssert = new SoftAssert();
        myAssert.assertTrue(a != b, ("they are different"));
        myAssert.assertTrue(a < b, ("a is bigger"));
        myAssert.assertTrue(a == b, ("they are equal"));

        myAssert.assertAll();
    }
}
