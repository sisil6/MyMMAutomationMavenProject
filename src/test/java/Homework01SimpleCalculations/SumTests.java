package Homework01SimpleCalculations;

import org.testng.Assert;
import org.testng.annotations.*;

public class SumTests {
    @BeforeTest(alwaysRun = true)
    public void beforeTest() {
        System.out.println("This is before test update!");
    }

    @AfterTest(alwaysRun = true)
    public void afterTest() {
        System.out.println("This is after test update!");
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {
        System.out.println("This is before method update!");
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        System.out.println("This is after method update!");
    }

    @Test()
    @Parameters({ "a", "b" })
    public void multiParamTest(int a, int b) {
        System.out.println("Assert the sum equals 15");
        Assert.assertEquals((a+b), 15 , "Assert the sum equals 15");
    }
}
