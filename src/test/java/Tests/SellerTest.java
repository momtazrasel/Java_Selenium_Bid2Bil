package Tests;

import Pages.SellerPage;
import org.testng.annotations.Test;

public class SellerTest extends LoginTest{
    @Test
    public void sellerTest() throws InterruptedException {
        bidTwoBillLogin();
        SellerPage sellerPage = homePage.seller();
        sellerPage.getSellerTab();
    }


}
