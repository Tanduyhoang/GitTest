import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    WebDriver driver;

    //    @Test
    public void initialWebDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.quit();

        System.out.println("browser automation");
        System.out.println("web automation");
    }

}
