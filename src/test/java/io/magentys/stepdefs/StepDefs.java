package io.magentys.stepdefs;

import javax.inject.Inject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.magentys.cinnamon.webdriver.Browser;
import io.magentys.pages.GooglePage;

import static io.magentys.cinnamon.webdriver.Browser.open;
import static io.magentys.cinnamon.webdriver.conditions.ElementConditions.*;
import io.magentys.cinnamon.conf.Env;
import io.magentys.pages.MagenTysHomePage;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class StepDefs {

    private final GooglePage googlePage;
    private final MagenTysHomePage magenTysHomePage;
    private final Env env;

    @Inject
    public StepDefs(final Env env, final GooglePage googlePage,
                    final MagenTysHomePage magenTysHomePage) {
        this.env = env;
        this.googlePage = googlePage;
        this.magenTysHomePage = magenTysHomePage;
    }

    @Given("^I am on Google home page$")
    public void i_am_on_Google_home_page() throws Throwable {
        open(env.config.getString("base-url"));
        Assert.assertTrue("Cannot open the website", googlePage.searchBox.waitUntil(displayed).isPresent());
    }

    @When("^I search for \"([^\"]*)\" website$")
    public void i_search_for_website(String searchPhrase) throws Throwable {
        googlePage.searchBox.waitUntil(displayed.and(enabled)).typeText(searchPhrase);
        googlePage.searchBox.typeText(Keys.RETURN);
    }

    @Then("^I should see Magentys in the result list$")
    public void i_should_see_Magentys_in_the_result_list() throws Throwable {
        Assert.assertTrue("Result list does not contain Magentys website",
                googlePage.isPresentInResult("MagenTys - DevOps | BDD | Test Automation | Atlassian| London | UK"));
    }

    @Given("^I open browser$")
    public void i_open_browser() throws Throwable {
        open(env.config.getString("base-url"));
        Assert.assertTrue("Cannot open the website", googlePage.searchBox.waitUntil(displayed).isPresent());
    }

    @When("^I navigate to \"([^\"]*)\"$")
    public void i_navigate_to(String url) throws Throwable {
        Browser.open(url);
    }

    @Then("^I should see Magentys website$")
    public void i_should_see_Magentys_website() throws Throwable {
        Assert.assertTrue("MagenTys home page not shown.",
                magenTysHomePage.homePage.waitUntil(displayed.and(enabled)).isPresent());
    }
}