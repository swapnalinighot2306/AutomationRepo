package MavenProgram;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FirstMavenProgram {
        public static void main(String[] args) throws InterruptedException{
            System.setProperty("webdriver.chrome.driver","C:/Users/swapn/Downloads/chromedriver_win32/chromedriver.exe");
            WebDriver driver= new ChromeDriver();
            driver.get("http:\\www.facebook.com");
            (4000);
            driver.close();
        }
}
