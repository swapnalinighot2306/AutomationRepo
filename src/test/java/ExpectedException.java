import org.testng.annotations.*;
import java.io.IOException;
public class ExpectedException {
    @Test(expectedExceptions = {ArithmeticException.class,IOException.class})
    public void testCaseA() {
        System.out.println("Test Case A");
        System.out.println(10/0);
        System.out.println("Hello");
    }
    @Test
    public void testCaseB() {
        System.out.println("Test Case B");
    }
    @Test
    public void testCaseC() {
        System.out.println("Test Case C");
    }
}
