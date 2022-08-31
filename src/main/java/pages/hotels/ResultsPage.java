package pages.hotels;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ResultsPage  extends BasePage {

    public ResultsPage() throws IOException {
    }

    By destinationInput = By.xpath("//div[@class='uitk-menu-trigger']/div[contains(@class,'has-icon')]/input[@placeholder='Placeholder']");
    By checkInDateInput = By.xpath("//button[contains(@aria-label, 'Check-in')]");
    By checkOutDateInput = By.xpath("//button[contains(@aria-label, 'Check-out')]");
    By travellersDetailsInput = By.xpath("//input[@data-stid='input-date' and contains(@value, 'room')]");

    public WebElement getDestinationInput() throws IOException {
        return getDriver().findElement(destinationInput);
    }

    public WebElement getCheckInDateInput() throws IOException {
        return getDriver().findElement(checkInDateInput);
    }

    public WebElement getCheckOutDateInput() throws IOException {
        return getDriver().findElement(checkOutDateInput);
    }

    public WebElement getTravellersDetailsInput() throws IOException {
        return getDriver().findElement(travellersDetailsInput);
    }
}
