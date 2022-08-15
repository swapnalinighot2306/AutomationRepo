package RetryField;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerUse implements ITestListener {
    public  void onTestStart(ITestResult result){
        System.out.println("This Is "); }

    public  void onTestSuccess(ITestResult result){
        System.out.println("The Simulation Game "); }

    public  void onTestFailure(ITestResult result){
        System.out.println("It's Not Represent "); }

    public  void onTestSkipped(ITestResult result){
        System.out.println("A Real World "); }

    public  void onStart(ITestContext context){
        System.out.println("Players Unknown"); }

    public  void onFinish(ITestContext context){
        System.out.println("Battleground "); }   }
