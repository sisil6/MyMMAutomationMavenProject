package Homework01SimpleCalculations;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DivideAndMultiplyTests {
    @Test(alwaysRun = true)
    public void testName(){
        System.out.println("Group tests:");
    }
    @Test(alwaysRun = true, dependsOnGroups = "divideAndMultiply")
    @Parameters({ "a", "b" })
    public void IsMultiplied(int a, int b) {
        System.out.println("Assert a to multiply b and the result to be 50");
        Assert.assertEquals((a*b), 50 , "Assert the sum equals 50");
    }

    @Test(alwaysRun = true, dependsOnGroups = "divideAndMultiply", priority = 1)
    @Parameters({ "a", "b" })
    public void IsDivided(int a, int b) {
        System.out.println("Assert a to divide b and the result to be 2");
        Assert.assertEquals((a/b), 2 , "Assert the sum equals 2");
    }

    @Test(alwaysRun = true, groups = "divideAndMultiply")
    @Parameters({ "a", "b" })
    public void group(int a, int b) {
        System.out.println("Assert a is different from b");
        Assert.assertNotEquals(a, b);

    }
}

