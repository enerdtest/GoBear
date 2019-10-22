package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestBase{
    WebDriver driver;

    @BeforeClass
    public void open_browser_go_to_application(){
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.gobear.com/ph?x_session_type=UAT");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void close_browser(){
        driver.quit();
    }

}
