package annotations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class ParallelTestingConcept {
    ThreadLocal<RemoteWebDriver> driver = new ThreadLocal();
    public WebDriver getDriver() {
        return driver.get();}
        @BeforeMethod(groups = "smoke")
        public void beforeMethod(){
            System.out.println("Swapnali");
            System.setProperty("webdriver.chrome.driver","C:/Users/swapn/Downloads/chromedriver_win32/chromedriver.exe");
            driver.set(new ChromeDriver());
            getDriver().get("http://www.facebook.com");
            getDriver().manage().window().maximize(); }
        @Test
        public void testCase1() {
            System.out.println(getDriver().getTitle());
            Assert.assertEquals(getDriver().getTitle(),"Google", "The title should not be same");
            System.out.println("Hello"); }
        @Test(groups = {"smoke","sn"})
        public void testCase2(){
            System.out.println(getDriver().getTitle()); }
        @AfterMethod()
        public void afterMethod(){
            System.out.println(getDriver().getTitle());
            getDriver().close(); } }


