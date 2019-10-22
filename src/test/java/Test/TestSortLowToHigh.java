package Test;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ResultPage;
import pages.Utils;

import java.util.List;

public class TestSortLowToHigh extends TestBase {

    @Test(priority = 1)
   public void test_sort_price_low_to_high(){

        HomePage homePage = new HomePage(driver);
        ResultPage resultPage = new ResultPage(driver);
        homePage.select_tb_insurance();
        homePage.select_TabTravel();
        homePage.go_to_result_page();

       resultPage.click_on_sort_price_low_to_high();

       List<Integer> prices = resultPage.get_list_price_of_cards();
        Assert.assertTrue(Utils.is_arraylist_sorted_accessding(prices));
   }
}
