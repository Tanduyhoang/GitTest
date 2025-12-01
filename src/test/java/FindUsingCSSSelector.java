import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FindUsingCSSSelector {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");
        driver.findElement(By.partialLinkText("Form Au")).click();
        //driver.findElement(By.id("username")).sendKeys("tomsmith");   //id
        driver.findElement(By.cssSelector("input#username")).sendKeys("tomsmith"); //cssSelector
        //driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("input#password")).sendKeys("SuperSecretPassword!"); //cssSelector
        //driver.findElement(By.tagName("Button")).click();   //tagName
        driver.findElement(By.cssSelector("button.radius")).click();

        Thread.sleep(2000);
        driver.quit();
    }
}
