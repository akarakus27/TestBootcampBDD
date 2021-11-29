package bootcamp.pages;

import bootcamp.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreditCardsPage {

    public CreditCardsPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(linkText = "Apply Now")
    public WebElement applyButton;

    public void openApplyPage() {
        applyButton.click();
    }
}