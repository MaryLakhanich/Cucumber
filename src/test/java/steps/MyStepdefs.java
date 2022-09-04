package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.YandexSearchPage;

public class MyStepdefs {
    private WebDriver driver;
    private YandexSearchPage yandexSearchPage;
    private String searchWord;
    @Given("Word for search is TechMeSkills")
    public void wordForSearchIsTechMeSkills() {

    }

    @When("I enter search word")
    public void iEnterSearchWord() {
        yandexSearchPage.
    }

    @And("I press search button")
    public void iPressSearchButton() {
    }

    @Then("First result contains search word in title")
    public void firstResultContainsSearchWordInTitle() {
    }

    @Then("There are {int} results present")
    public void thereAreResultsPresent(int arg0) {
    }

    @Given("Word for search is {string}")
    public void wordForSearchIs(String arg0) {
    }
}
