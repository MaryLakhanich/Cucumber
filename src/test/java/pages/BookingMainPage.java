package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookingMainPage extends BasePage {

    private final static By SEARCH_INPUT = By.xpath("//input[@name='ss']");
    private final static By SEARCH_BUTTON_LOCATOR = By.xpath("//button[@type='submit']");
    public BookingMainPage(WebDriver driver) {
        super(driver);
    }

    public void searchByKeyword(String keyword) {
        WebElement searchInput = driver.findElement(SEARCH_INPUT);
        searchInput.sendKeys(keyword);
        searchInput.sendKeys(Keys.ENTER);
    }
    public void clickSearchButton(){
        driver.findElement(SEARCH_BUTTON_LOCATOR).click();
    }
}
