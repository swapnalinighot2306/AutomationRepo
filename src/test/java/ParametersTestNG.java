import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class ParametersTestNG {
   public static WebDriver driver;
        @BeforeMethod(groups = "smoke")
        public void beforeMethod(){
            System.out.println("Swapnali");
            System.setProperty("webdriver.chrome.driver","C:/Users/swapn/Downloads/chromedriver_win32/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("http://www.google.com");
            driver.manage().window().maximize();
        }
        @Test
        public void testCaseA() {
            System.out.println(driver.getTitle());
            WebElement element = driver.findElement(By.name("q"));
            element.sendKeys("Gujarat");
        }
        @Test
        public void testCaseB() {
            System.out.println(driver.getTitle());
            System.out.println("Hello");
        }
        @AfterMethod()
        public void afterMethod() {
            System.out.println(driver.getTitle());
           driver.close(); }  }


