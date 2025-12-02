import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

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


    public void goToUrl(String url) {
        driver.get(url);
        String title = driver.getTitle();
        System.out.println(title);
        System.out.println("Web Elements");
    }


}
