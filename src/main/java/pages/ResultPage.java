package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class ResultPage extends BasePage{

    @FindBy(xpath = "//div[@class='results-text pull-left']")
    WebElement lbelTotalCard;

    @FindBy(xpath = "//h5[@class='item-title']")
    WebElement menuCategories;

    @FindBy(xpath = "//div[@data-filter-name='Promos Only']")
    WebElement radioPromotion;

    @FindBy(xpath = "//div[@data-filter-name='Show all ']")
    WebElement radioShowAll;


    @FindBy(xpath = "//label[contains(text(),'Low to high')]")
    WebElement getRadioSort;

    @FindBy(xpath = "//span[@class='value']")
    WebElement getPriceText;

    @FindBy(xpath = "//label[contains(text(),'annual trip ')]")
    WebElement radioAnualTrip;

    @FindBy(xpath = "//label[contains(text(),'Pacific Cross ')]")
    WebElement getInsuresText;


    public ResultPage(WebDriver driver){
        super(driver);
    }

    public Integer get_total_cards() throws InterruptedException {
        wait_for_element_visible(lbelTotalCard);
        String[] totalCards = get_text_of_element(lbelTotalCard).split(" ");
        Integer total = Integer.valueOf(totalCards[0]);
        return total;
    }

    public Integer get_total_menu_items() {
        wait_for_element_visible(menuCategories);
        List<WebElement> menuItem = driver.findElements(By.xpath("//h5[@class='item-title']"));
        return menuItem.size();
    }

    public void click_on_filter_promotion_only() {
        wait_for_element_visible(radioPromotion);
        click_on_element(radioPromotion);
    }

    public void click_on_filter_show_all(){
        wait_for_element_visible(radioShowAll);
        click_on_element(radioShowAll);
    }
    public void click_on_sort_price_low_to_high(){
        wait_for_element_visible(getRadioSort);
        click_on_element(getRadioSort);
    }

    public List<Integer> get_list_price_of_cards(){
        wait_for_element_visible(getPriceText);
        List<WebElement> elements = driver.findElements(By.xpath("//span[@class='value']"));
        List<Integer> prices = new ArrayList<Integer>();
        for(WebElement e:elements){
            prices.add(Integer.valueOf(e.getText().replace(",","")));
        }
        return prices;
    }

    public void click_on_detail_anual_trip(){
        wait_for_element_visible(radioAnualTrip);
        click_on_element(radioAnualTrip);
    }

    public String get_insures_menu_list(){
        wait_for_element_visible(getInsuresText);
        String insureText = getInsuresText.getText();
        return insureText;
    }

}
