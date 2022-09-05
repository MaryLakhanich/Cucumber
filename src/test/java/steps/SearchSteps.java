package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BookingMainPage;
import pages.BookingSearchPage;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class SearchSteps {
    private static final String BOOKING_URL = "https://www.booking.com/searchresults.en-gb.html";
    private WebDriver driver;
    private BookingMainPage bookingMainPage;
    private BookingSearchPage bookingSearchPage;
    String keyword;

    @Before
    public void initialize() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Given("Keyword for search is {string}")
    public void keywordForSearchIs(String keyword) {
        this.keyword = keyword;
    }

    @When("User navigates to booking.com")
    public void navigate() {
        driver.get(BOOKING_URL);
        bookingMainPage = new BookingMainPage(driver);
        bookingSearchPage = new BookingSearchPage(driver);
    }

    @And("User enters key word")
    public void userEntersHotelName() {
        bookingMainPage.searchByKeyword(this.keyword);
    }
    @And("User clicks search button")
    public void iPressSearchHotelButton() {
        bookingMainPage.clickSearchButton();
    }
    @Then("Search result with {string} in title is on the first page")
    public void assertSearchResult(String hotel) {
        List<String> hotelsFound = bookingSearchPage.getResultLinks();
        assertEquals(hotelsFound.get(0), hotel, "Another hotel was expected");
    }

    @And("Hotel has rating {string}")
    public void hotelHasRating(String rating) {
        List<String> ratings = bookingSearchPage.getRating();
        assertEquals(ratings.get(0), rating, "Another rating was expected");
    }
}
