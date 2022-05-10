package BasicTests;

import org.testng.annotations.Test;

public class GroupTests {
    @Test(alwaysRun = true, priority = -1)
    public void testName(){
        System.out.println("Group tests:");
    }
    @Test(alwaysRun = true, dependsOnGroups = "mygroup")
    public void sampleTest() {
        System.out.println("This is second, it depends on the group tests");
    }

    @Test(alwaysRun = true, groups = "mygroup")
    public void groupExample() {
        System.out.println("This is a test from a group - appears first");
    }

}
