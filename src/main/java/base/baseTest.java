package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;
import org.openqa.selenium.remote.RemoteWebDriver;

public class baseTest {

    public static RemoteWebDriver driver;

    @BeforeMethod
    public void setUp(){
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path+"/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterMethod
    public void tearDown()  {
        if (driver != null) {
            driver.quit();
        }
    }
}
