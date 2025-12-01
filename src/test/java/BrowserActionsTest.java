import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class BrowserActionsTest {
    WebDriver driver;


    @Test
    public void firstTest() {
        driver = new ChromeDriver();
        driver.get("https://google.com");
        navigation("https://youtube.com");
        getCurrentUrl();
        getTitle();
        getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        getWindowHandle();
        //close();
        quit();
    }

    public void navigation(String url) {
        driver.navigate().to(url);
    }

    public void navigateBack() {
        driver.navigate().back();
    }

    public void navigateForward() {
        driver.navigate().forward();
    }

    public void refresh() {
        driver.navigate().refresh();
    }

    public void maximize() {
        driver.manage().window().maximize();
    }

    public void minimize() {
        driver.manage().window().minimize();
    }

    public void setPosition() {
        driver.manage().window().setPosition(new Point(0, 200));
    }

    public void iphone14ProDimension() {
        driver.manage().window().setSize(new Dimension(430, 932));
    }

    public void ipadDimension() {
        driver.manage().window().setSize(new Dimension(1024, 1366));
    }

    public void fullScreen() {
        driver.manage().window().fullscreen();
    }

    public void getCurrentUrl() {
        String URL = driver.getCurrentUrl();
        System.out.println("Current URL is:" + URL);
    }

    public void getTitle() {
        String title = driver.getTitle();
        System.out.println("Current title is:" + title);
    }

    public void getPageSource() {
        String pageScource = driver.getPageSource();
        System.out.println("This is page source: " + pageScource);
    }

    public void getWindowHandle() {
        String windowHandle = driver.getWindowHandle();
        System.out.println("Window Handle is:" + windowHandle);
    }

    public void close() {
        driver.close();
    }

    public void quit() {
        driver.quit();
    }
}
