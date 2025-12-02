import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseTest {
    WebDriver driver;
//    @Test
    public void initialWebDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.quit();
    }
}
