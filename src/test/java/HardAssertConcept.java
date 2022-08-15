import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAssertConcept {
    public static WebDriver driver;
    @BeforeMethod(groups = "smoke")
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver","C:/Users/swapn/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.instagram.com");
        driver.manage().window().maximize();
    }

    @Test
    public void testCaseA() {
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Instagram","The title should be Instagram");
        System.out.println("Hello");
    }
    @Test(groups = {"smoke","sn"})
    public void testCaseB() {
        System.out.println(driver.getTitle());
    }
    @AfterMethod()
    public void afterMethod() {
        System.out.println(driver.getTitle());
        driver.close();
    }
}


