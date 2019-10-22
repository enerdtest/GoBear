package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver,60);
    }

    public void wait_for_element_visible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void click_on_element(WebElement element){
        element.click();
    }


    public void type_on_element(WebElement element, String value){
        element.sendKeys(value);
    }

    public String get_text_of_element(WebElement element){
        return element.getText();
    }
}
