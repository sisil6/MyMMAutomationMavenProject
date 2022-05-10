package BasicTests;
import org.testng.annotations.*;

public class InheritanceTests {
    public class BaseClass {

        @BeforeMethod
        public void beforeMethod() {
            System.out.println("BaseClass's Before Test method");
        }
        @AfterMethod
        public void afterMethod() {
            System.out.println("BaseClass's After Test method");
        }
        @BeforeClass
        public void beforeClass() {
            System.out.println("BaseClass's Before Class method");
        }
        @AfterClass
        public void afterClass() {
            System.out.println("BaseClass's After Class method");
        }
    }

    public class ChildClass extends BaseClass {

        @BeforeMethod
        public void beforeChildMethod() {
            System.out.println("ChildClass's Before Test method");
        }

        @AfterMethod
        public void afterChildMethod() {
            System.out.println("ChildClass's After Test method");
        }

        @BeforeClass
        public void beforeChildClass() {
            System.out.println("ChildClass's Before Class method");
        }

        @AfterClass
        public void afterChildClass() {
            System.out.println("ChildClass's After Class method");
        }

        @Test
        public void testCase() {
            System.out.println("===== Executing actual test ======");
        }
    }
}
