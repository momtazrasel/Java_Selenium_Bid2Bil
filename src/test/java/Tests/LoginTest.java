package Tests;
import Base.Base;
import Pages.LoginPage;
import org.testng.annotations.Test;
public class LoginTest extends Base {
    @Test
    public void bidTwoBillLogin() throws InterruptedException {
        LoginPage login = homePage.signIn();
        login.getPasswordOne();
        login.getEnterButton();
        login.getUsername();
        login.getPassword();
        login.getLogin();


    }



}
