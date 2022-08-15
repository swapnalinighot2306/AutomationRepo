import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class ParameterAnnotation {
    public static WebDriver driver;
    @BeforeMethod
    @Parameters({"browserName"})
    public void beforeMethod(String browserName){
        if(browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver","C:/Users/swapn/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        } else if(browserName.equals("edge")){
            System.setProperty("webdriver.edge.driver","C:/Users/swapn/Downloads/edgedriver_win64/msedgedriver.exe");
            driver = new EdgeDriver();}
        else{
            System.out.println("please select correct browser name");
            }
        driver.get("http://www.google.com");
        driver.manage().window().maximize(); }
    @Test
    @Parameters({"s1,s2"})
    public void testCaseA(String s1, String s2) {
        System.out.println(driver.getTitle());
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(s1+""+s2);
        element.sendKeys(Keys.ENTER); }
        @AfterMethod(groups = "smoke")
    public void afterMethod() {
        System.out.println("Hello");
        driver.close(); }  }


