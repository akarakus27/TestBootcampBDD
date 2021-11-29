package bootcamp.step_def;
import bootcamp.pages.SiginPage;
import bootcamp.pages.Homepage;
import bootcamp.pages.*;
import bootcamp.pages.SearchResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {

    Homepage homepage = new Homepage();
    SearchResultPage searchResultPage = new SearchResultPage();
    SiginPage siginPage = new SiginPage();
    CreditCardsPage creditCardsPage = new CreditCardsPage();
    CardApplicationPage cardApplicationPage = new CardApplicationPage();


    @Given("homepage is open")
    public void homepageIsOpen() {
        homepage.chooseUS();
    }

    @When("I close the pop up")
    public void iCloseThePopUp() {

        homepage.closePopup();
    }

    @Then("Logo Should be displayed")
    public void logoShouldBeDisplayed() {
        homepage.verifyLogo();
    }

    @When("I search for {string}")
    public void iSearchFor(String searchKey) {
        homepage.searchFor(searchKey);
    }

    @Then("search result should be seen")
    public void searchResultShouldBeSeen() {
        searchResultPage.verifySearchResult();
    }


    @And("I open {string} dropdown menu")
    public void OpenDropdownMenu(String dropdown) {
        homepage.openDropdown(dropdown);
    }

    @When("I choose {string} submenu")
    public void ChooseSubmenu(String submenu) {
        homepage.openSubmenu(submenu);
    }

    @Then("sign in page should open")
    public void signInPageShouldOpen() {
        siginPage.verifyTitle();
    }


    @And("I open my best buy credit card page")
    public void iOpenMyBestBuyCreditCardPage() {
        homepage.openMyCreditCardPage();
    }

    @When("I open applicaiton page")
    public void ıOpenApplicaitonPage() {
        creditCardsPage.openApplyPage();

    }

    @Then("application page should page")
    public void applicationPageShouldPage() {
        cardApplicationPage.verifyTitle();
    }
}
