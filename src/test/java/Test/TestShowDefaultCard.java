package Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.ResultPage;

import java.util.concurrent.TimeUnit;


public class TestShowDefaultCard extends TestBase{


    @Test(priority = 0)
    public void assert_total_card_show_by_default() throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        ResultPage resultPage = new ResultPage(driver);
        homePage.select_tb_insurance();
        homePage.select_TabTravel();
        homePage.go_to_result_page();

        SoftAssert softAssertion= new SoftAssert();

        TimeUnit.MILLISECONDS.sleep(5000);
        Assert.assertTrue(resultPage.get_total_cards() > 3);
//        Assert.assertTrue(resultPage.get_total_menu_items()==3);
        softAssertion.assertTrue(resultPage.get_total_menu_items()==3);
    }



}
