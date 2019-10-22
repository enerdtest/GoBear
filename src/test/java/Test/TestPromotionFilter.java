package Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ResultPage;

import java.util.concurrent.TimeUnit;


public class TestPromotionFilter extends TestBase {

    @Test(priority = 2)
    public void assert_filter_promotion() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        ResultPage resultPage = new ResultPage(driver);
        homePage.select_tb_insurance();
        homePage.select_TabTravel();
        homePage.go_to_result_page();

        Assert.assertTrue(resultPage.get_total_cards() >= 3);

        resultPage.click_on_filter_promotion_only();
        TimeUnit.MILLISECONDS.sleep(5000);
        Assert.assertTrue(resultPage.get_total_cards() == 0);

    }

}
