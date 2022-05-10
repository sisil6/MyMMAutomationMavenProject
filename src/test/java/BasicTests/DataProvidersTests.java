package BasicTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidersTests {
    @DataProvider(name = "test1")
    public Object[][] dpMethod2() {
        return new Object[][]{{"John", (36)}, {"Mary", (37)}};
    }

    @Test(dataProvider = "test1")
    public void myTest2(String n1, Integer n2) {
        System.out.println("This is " + n1 + ", " + n2 + " years old.");
    }
}


