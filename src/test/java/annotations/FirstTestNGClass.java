package annotations;
import org.testng.annotations.*;

public class FirstTestNGClass {
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class"); }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method"); }
    @Test
    public void testCase1(){
        System.out.println("Test Case 1"); }
    @Test
    public void testCase2(){
        System.out.println("Test Case 2");}
        @Test
        public void testCase3(){
            System.out.println("Test Case 3"); }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method"); }
    @AfterClass
    public void afterClass(){
        System.out.println("Before Method"); }

    }

