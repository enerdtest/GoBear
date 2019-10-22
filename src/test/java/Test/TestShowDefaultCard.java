package Test;

import org.testng.Assert;
import org.testng.annotations.Test;
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

        System.out.println(resultPage.get_total_cards());
        Assert.assertTrue(resultPage.get_total_cards() >= 3);
        System.out.println(resultPage.get_total_menu_items());
        Assert.assertTrue(resultPage.get_total_menu_items()==3);
    }



}
