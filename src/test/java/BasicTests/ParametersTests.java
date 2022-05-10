package BasicTests;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTests {
    @Test(groups = "parameters")
    @Parameters({ "single"})
    public void singleParamTest(String single){
        System.out.println("The single one is: " + single);
    }

    @Test(groups = "parameters")
    @Parameters({ "married", "inRelationship" })
    public void multiParamTest(String married, String inRelationship) {
        System.out.println("In relationships are " + married + " and " + inRelationship);
    }

    @Parameters({ "unknown" })
    @Test
    public void optionTest(@Optional("default") String unknown) {
        System.out.println("We don't know the relationship status of " + unknown);
    }

}
