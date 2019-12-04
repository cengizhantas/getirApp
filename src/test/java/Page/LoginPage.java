package Page;

import Base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class LoginPage extends BasePage
{
    public LoginPage(AppiumDriver<MobileElement> driver)
    {
        super(driver);
    }

    public void loginAndAddToBasketEraseAndCheck(String email, String password)
    {
        sendKeys(emailTextbox, email);
        sendKeys(passwordTextbox, password);
        clickElement(signinButton);
        loginCheckGetirDemo();
        addtoBasketAndEraseItemAndCheck();
    }

    public void addtoBasketAndEraseItemAndCheck()
    {
        clickKisiselBakim();
        clickSabunSelection();
        clickBackButton();
        clickEvBakim();
        clickDeterjanSelection();
        goToBasketAndEraseItemsAndCheck();
    }

    public void clickKisiselBakim()
    {
        clickElement(kisiselBakimCategories);
    }

    public void clickEvBakim()
    {
        clickElement(evBakimiCategories);
    }

    public void clickSabunSelection()
    {
        clickElement(sabunSelection);
    }

    public void clickDeterjanSelection()
    {
        clickElement(deterjanSelection);
    }

    public void clickBackButton()
    {
        clickElement(backButton);
    }

    public void goToBasketAndEraseItemsAndCheck()
    {
        clickElement(basketButton);
        clickElement(eraseFromBasketButton);
        clickElement(eraseFromBasketButton);
        emptyBasketCheck();
    }

    public void loginCheckGetirDemo()
    {
        assertText(iceceklerCategories, iceceklerCategoriesText);
    }

    public void emptyBasketCheck()
    {
        assertText(emptyBasketMessage, emptyBasketMessageText);
    }


    public String userName = "hello@getir.com";
    public String password = "hello";
    private String categoriesLabelText = "Categories";
    private String iceceklerCategoriesText = "İçecekler";
    private String emptyBasketMessageText = "Your card is empty!";

    private By signinButton = By.id("com.getir.getirtestingcasestudy:id/email_sign_in_button");
    private By emailTextbox = By.id("com.getir.getirtestingcasestudy:id/email");
    private By passwordTextbox = By.id("com.getir.getirtestingcasestudy:id/password");
    private By categoriesLabel = By.id("com.getir.getirtestingcasestudy:id/action_bar");
    private By iceceklerCategories = By.id("com.getir.getirtestingcasestudy:id/category_name");
    private By kisiselBakimCategories = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.TextView");
    private By sabunSelection = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]");
    private By backButton = By.xpath("//android.widget.ImageButton[@content-desc=\"Yukarı git\"]");
    private By evBakimiCategories = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[5]/android.widget.TextView");
    private By deterjanSelection = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]");
    private By basketButton = By.id("com.getir.getirtestingcasestudy:id/basket");
    private By eraseFromBasketButton = By.id("com.getir.getirtestingcasestudy:id/imageview_remove");
    private By emptyBasketMessage = By.id("com.getir.getirtestingcasestudy:id/empty_textview");

}