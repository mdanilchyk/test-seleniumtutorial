import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class SimpleTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("undexpectedAlertBehaviour", "dismiss");
//        driver = new ChromeDriver(caps);
//        System.out.println(((HasCapabilities) driver).getCapabilities());
//        wait = new WebDriverWait( driver, 10);
        driver = new ChromeDriver();
        wait = new WebDriverWait( driver, 10);
    }


   @Test
    public void NavigateToGoogleAndSearchWebDriver()

    {

        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("Webdriver");
        driver.findElement(By.name("btnK")).click();
        wait.until(titleIs("Webdriver - Пошук Google"));
    }
    @After
    public void stop(){
       driver.quit();
       driver = null;
    }


}
