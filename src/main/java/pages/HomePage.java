package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[@aria-controls='Travel']")
    WebElement tabTravel;

    @FindBy(xpath = "//button[@name='product-form-submit']")
    WebElement btnShowResult;

    @FindBy(xpath = "//a[@aria-controls='Insurance']")
    WebElement tabInsurerance;


    public HomePage(WebDriver driver){
        super(driver);
    }


    public void select_tb_insurance(){
        wait_for_element_visible(tabInsurerance);
        click_on_element(tabInsurerance);
    }

    public void select_TabTravel(){
        wait_for_element_visible(tabTravel);
        click_on_element(tabTravel);
    }


    public void go_to_result_page(){
     wait_for_element_visible(btnShowResult);
     click_on_element(btnShowResult);
    }



}

