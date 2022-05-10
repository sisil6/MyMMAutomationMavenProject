package Homework01SimpleCalculations;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

    public class ExtractTests {
        @DataProvider (name = "data-provider")
        public Object[][] dpMethod(){
            return new Object[][] {{5, 3 , 2}};
        }
        @Test (dataProvider = "data-provider")
        public void myTest (int a, int b, int result) {
            int sum = a - b;
            System.out.println("Assert the extraction result is 2");
            Assert.assertEquals(result, sum);
        }
    }




