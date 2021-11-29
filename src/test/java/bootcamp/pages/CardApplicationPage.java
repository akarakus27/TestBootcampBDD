package bootcamp.pages;

import bootcamp.utils.Driver;
import bootcamp.utils.Helper;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class CardApplicationPage {
    public CardApplicationPage() {
        PageFactory.initElements(Driver.get(),this);
    }

    public void verifyTitle() {

        Helper.switchLastTab();
        String title = Driver.get().getTitle();
        Assert.assertEquals("Sign In to Best Buy", title);
    }
}