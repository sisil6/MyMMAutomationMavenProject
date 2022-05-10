package BasicTests;

import org.testng.annotations.Test;

public class PriorityTests {

    @Test(groups = "example3", description = "Desc", testName = "Priority test executed first", priority = -1)
    public void priorityFirstExample() {
        System.out.println("This is a first priority test");
    }

    @Test(groups = "example3", description = "Desc", testName = "Priority test executed last", priority = 1)
    public void priorityLastExample() {
        System.out.println("This is a second priority test");
    }


}
