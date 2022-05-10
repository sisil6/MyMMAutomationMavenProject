package Homework01SimpleCalculations;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ModulTests {
    @Test()
    @Parameters({ "a", "b" })
    public void multiParamTest(int a, int b) {
        System.out.println("Assert the modul division to equals 0");
        Assert.assertEquals((a%b), 0 , "Assert the sum equals 0");
    }
}
