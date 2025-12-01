import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTesting {
    /*WebDriver driver;

    @Test
    public void testValidLogin() throws InterruptedException {
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();

        Thread.sleep(2000);
        driver.quit();
    }*/

    public static void main(String[] firstTime) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");
        /*driver.findElement(By.id("APjFqb")).sendKeys("https://the-internet.herokuapp.com" + Keys.ENTER);
        driver.findElement(By.partialLinkText("internet (Heroku)")).click();*/
        driver.findElement(By.partialLinkText("Dynamic Lo")).click();
        Thread.sleep(2500);
        driver.navigate().back();
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        //driver.findElement(By.className("radius")).click();  //className
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
