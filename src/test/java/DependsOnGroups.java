import org.testng.Assert;
import org.testng.annotations.Test;
public class DependsOnGroups {
    @Test(groups = "smoke")
    public void testCaseA() {
        System.out.println("Test Case A");
        Assert.assertTrue(false);
    }
    @Test(dependsOnGroups = "smoke", alwaysRun = true)
    public void testCaseB() {
        System.out.println("Test Case B"); }
    @Test(dependsOnMethods = "testCaseA")
    public void testCaseC() {
        System.out.println("Test Case C"); }
    @Test
    public void testCaseD() {
        System.out.println("Test Case D"); }
}





