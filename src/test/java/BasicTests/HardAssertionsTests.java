package BasicTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Scanner;

public class HardAssertionsTests {

    @Test()
    public void simpleCalculation(){
        int result = Math.max(3, 4);

        Assert.assertEquals(result, 4);
        Assert.assertNotEquals(result, 3);
    }

}

