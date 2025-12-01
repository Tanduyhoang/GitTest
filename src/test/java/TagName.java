import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class TagName {
    public static void main(String[] tagName) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com");
        driver.findElement(By.partialLinkText("Data Tables")).click();
        WebElement table1 = driver.findElement(By.id("table1"));
        List<WebElement> tableRows = table1.findElements(By.tagName("tr"));
        System.out.println(tableRows.size());
        System.out.println(tableRows.get(0).getText());
        System.out.println(tableRows.get(1).getText());
        System.out.println(tableRows.get(2).getText());
        System.out.println(tableRows.get(3).getText());
        System.out.println(tableRows.get(4).getText());
        Thread.sleep(2000);
        driver.quit();


    }
}
