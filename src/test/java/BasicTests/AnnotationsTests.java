package BasicTests;

import org.testng.annotations.*;

public class AnnotationsTests {
    @Test(priority = -2)
    public void testName(){
        System.out.println("Annotations tests:");
    }

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
    public void myTest(){
        System.out.println("My Test");
    }

}


