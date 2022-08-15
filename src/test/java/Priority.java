import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");}
        @Test(priority = 0)
        public void testCaseA(){
        System.out.println("Test Case A");}
        @Test(priority=3)
        public void testCaseB(){
        System.out.println("Test Case B");}
        @Test(priority=-1)
        public void testCaseC(){
        System.out.println("Test Case C");}
        @AfterMethod
        public void afterMethod(){
        System.out.println("After Method");}
        }
