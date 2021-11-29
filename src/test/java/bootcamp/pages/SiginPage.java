package bootcamp.pages;

import bootcamp.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SiginPage {
    public SiginPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(tagName = "h1")
    public WebElement title;


    public void verifyTitle() {
        Assert.assertEquals("Sign In to Best Buy", title.getText());
    }
}