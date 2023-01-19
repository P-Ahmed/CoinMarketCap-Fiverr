package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import setup.Setup;

import java.text.ParseException;

public class dataValidationStepDefinitions extends Setup {
    HomePage homePage;

    @Given("user goes to the website")
    public void user_goes_to_the_website() {
        driver.get("https://coinmarketcap.com/");
    }

    @Given("user filters to show twenty rows of data")
    public void user_filters_to_show_twenty_rows_of_data() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.filterToShowTwentyData();
    }

    @Given("user captures row contents, name and price")
    public void user_captures_row_contents_name_and_price() throws ParseException {
        homePage = new HomePage(driver);
        homePage.capturePreFilterData();
    }

    @When("user clicks on Filter")
    public void user_clicks_on_filter() {
        homePage = new HomePage(driver);
        homePage.clicksOnFilter();
    }

    @When("user filters by Algorithm")
    public void user_filters_by_algorithm() {
        homePage = new HomePage(driver);
        homePage.filterByAlgorithm();
    }

    @When("user clicks on Add filter")
    public void user_clicks_on_add_filter() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.clicksOnAddFilter();
    }

    @When("user toggle's on Mineable")
    public void user_toggle_s_on_mineable() {
        homePage = new HomePage(driver);
        homePage.toggleOnMineable();
    }

    @When("User selects cryptocurrency and selects coin")
    public void user_selects_cryptocurrency_and_selects_coin() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.selectingCryptoCurrencyAndCoins();
    }

    @When("user selects price and inputs {string} & {string}")
    public void user_selects_coin_and_inputs(String min, String max) {
        homePage = new HomePage(driver);
        homePage.inputtingPriceRange(min, max);
    }

    @Then("user applies all the filters")
    public void user_applies_all_the_filters() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.applyingFilter();
    }

    @Then("user verifies the contents with previously captured contents")
    public void user_verifies_the_contents_with_previously_captured_contents() {
        homePage = new HomePage(driver);
        homePage.verifyName();
    }
}
