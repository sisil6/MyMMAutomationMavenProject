package BasicTests;

import org.testng.annotations.Test;

import java.io.IOException;

public class ExceptionsTests {
    @Test(groups = "example4", expectedExceptions = RuntimeException.class)
    public void throwExceptionExample() {
        System.out.println("Runtime Exception is triggered");
        throw new RuntimeException("Runtime Exception");
    }

    @Test(expectedExceptions = { IOException.class }, expectedExceptionsMessageRegExp = "Pass Message test passed")
    public void exceptionTestOne() throws Exception {
        throw new IOException("Pass Message test passed");
    }

    @Test(expectedExceptions = { IOException.class }, expectedExceptionsMessageRegExp = "Pass Message test")
    public void exceptionTestTwo() throws Exception {
        throw new IOException("Fail Message test");                                 //Fails
    }

}
