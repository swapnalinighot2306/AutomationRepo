package RetryField;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class RetryAnalyzerClass {
    ExtentReports extentReports = new ExtentReports();
    ExtentSparkReporter sparkReporter = new ExtentSparkReporter("extentReports.html");
    ExtentTest extentTest;
    @BeforeTest
    void beforeTest() {
        extentReports.attachReporter(sparkReporter); }
    @Test(retryAnalyzer = IRetryExample.class)
    public void testcaseA() {
        extentTest = extentReports.createTest("Launch the browser").pass("Test case is Pass").assignAuthor("Swapnali").assignDevice("Chrome");
        extentTest.fail("Test case is fail");
        Assert.assertTrue(false); }
    @Test
    public void testcaseB() {
        extentTest = extentReports.createTest("Launch the browser").pass("Test case is Pass").assignAuthor("Shahreen").assignDevice("Safari");
        extentTest.pass("Test case is Pass");
        Assert.assertTrue(true); }
    @Test(retryAnalyzer = IRetryExample.class)
    public void testcaseC() {
        extentTest = extentReports.createTest("Launch the browser").pass("Test case is Pass").assignAuthor("Falak").assignDevice("firefox");
        extentTest.fail("Test case is fail");
        Assert.assertTrue(false); }
    @Test
    public void testcaseD() {
        extentTest = extentReports.createTest("Launch the browser").pass("Test case is Pass").assignAuthor("Faiz").assignDevice("Edge");
        extentTest.pass("Test case is pass");
        Assert.assertTrue(true); }
    @AfterTest
    void afterTest(){
        extentReports.flush(); }  }

