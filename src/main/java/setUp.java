import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class setUp {
    public WebDriver driver = null;

    @BeforeTest(groups = "setup")
    public void configuration() throws IOException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        driver = new ChromeDriver();


    }

    @Test(groups = "setup")
    public void launch(){
        driver.get("https://www.gobear.com/ph?x_session_type=UAT");
        driver.quit();
    }
}
