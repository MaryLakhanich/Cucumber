package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YandexSearchPage extends BasePage{
    private final static By SEARCH_INPUT_LOCATOR= By.cssSelector("#text");
    private final static By BUTTON= By.cssSelector("button[type=submit]");

    public YandexSearchPage(WebDriver driver) {
        super(driver);
    }
}
