package Test;

import Base.BaseTest;
import Page.LoginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.Test;

public class DemoTest extends BaseTest
{
    @Test
    public void GetirLoginAndCheckDemo()
    {
        LoginPage lp = new LoginPage((AppiumDriver<MobileElement>) driver);
        lp.loginAndAddToBasketEraseAndCheck("hello@getir.com","hello");
    }
}