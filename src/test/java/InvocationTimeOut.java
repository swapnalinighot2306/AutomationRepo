import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class InvocationTimeOut {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");}
    @Test(invocationCount = 4,invocationTimeOut = 10)
    public void testCaseA(){
        System.out.println("Test Case A");}
    @Test
    public void testCaseB(){
        System.out.println("Test Case B");}
    @Test
    public void testCaseC(){
        System.out.println("Test Case C");}
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");}
}
