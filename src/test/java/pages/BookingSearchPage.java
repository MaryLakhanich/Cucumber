package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BookingSearchPage extends BasePage {

    private final static By HOTELS_NAMES = By.xpath("//div[@data-testid='title']");
    private final static By RATINGS = By.xpath("//div[contains(@aria-label,'Scored ')]");

    public BookingSearchPage(WebDriver driver) {
        super(driver);
    }

    public List<String> getResultLinks() {
        List<String> hotelsFound = new ArrayList<>();
        List<WebElement> elements = driver.findElements(HOTELS_NAMES);
        for (WebElement element : elements) hotelsFound.add(element.getText());
        return hotelsFound;
    }

    public List<String> getRating() {
        List<String> ratings = new ArrayList<>();
        List<WebElement> elements = driver.findElements(RATINGS);
        for (WebElement element : elements) ratings.add(element.getText());
        return ratings;
    }
}
