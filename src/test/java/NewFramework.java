import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NewFramework {
    Object driver;
    WebDriverWait wait = new WebDriverWait((WebDriver) driver, Duration.ofSeconds(20));

    public void init() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }


}
