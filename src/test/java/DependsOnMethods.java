
import org.testng.Assert;
import org.testng.annotations.Test;
public class DependsOnMethods {
    @Test
    public void testCaseA(){
        System.out.println("Test Case A");
        Assert.assertTrue(false);
    }
    @Test(dependsOnMethods = "testCaseA")
    public void testCaseB(){
        System.out.println("Test Case B");}
    @Test(dependsOnMethods = "testCaseB")
    public void testCaseC(){
        System.out.println("Test Case C");}
    @Test
    public void testCaseD(){
        System.out.println("Test Case D");}

}
