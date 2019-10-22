package Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ResultPage;

import java.util.concurrent.TimeUnit;

public class TestDetailPolicyFilter extends TestBase{

    @Test(priority = 3)
    public void test_filter_detail_policy() throws InterruptedException {
        HomePage homePage = new HomePage(driver);

        homePage.select_tb_insurance();
        homePage.select_TabTravel();
        homePage.go_to_result_page();

        ResultPage resultPage = new ResultPage(driver);

        resultPage.click_on_detail_anual_trip();
        TimeUnit.MILLISECONDS.sleep(5000);
        System.out.println(resultPage.get_total_cards());
        Assert.assertTrue(resultPage.get_total_cards() >= 7);
    }

}
