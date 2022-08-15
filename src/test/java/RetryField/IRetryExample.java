package RetryField;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryExample implements IRetryAnalyzer{
    int retryCount = 0;
    int maxRetryCount = 5;
    public boolean retry(ITestResult iTestResult){
    if(retryCount < maxRetryCount){
    retryCount++;
    return  true;
    }
    return false;
    }
}