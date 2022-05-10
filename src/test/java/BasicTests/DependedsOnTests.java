package BasicTests;

import org.testng.annotations.Test;

public class DependedsOnTests {
    @Test(groups = "example2", description = "Testng description is here"
            , dependsOnGroups = "example")
    public void dependsOnGroupExample() {
        System.out.println("This depends on Example group, so it will appear after it");
    }

    @Test(groups = "example4", dependsOnMethods = "myFirstTestNGTestCase")
    public void dependsOnMethodExample() {
        System.out.println("This depends on the myFirstTestNGTestCase method, so it will appear after it");
    }

    @Test
    public void myFirstTestNGTestCase() {
        System.out.println("This is myFirstTestNGTestCase method");
    }

    @Test(groups = "example")
    public void groupExample() {
        System.out.println("This is a test from Example group");
    }

}
