package pages.hotels;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Locale;


public class Homepage extends BasePage {

    WebDriver driver;

    public Homepage(WebDriver driver) throws IOException {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".osano-cm-dialog--position_bottom")
    private WebElement cookiesBanner;
    @FindBy(css = ".osano-cm-button.osano-cm-button--type_denyAll.osano-cm-buttons__button.osano-cm-denyAll")
    private WebElement rejectCookiesButton;
    @FindBy(css = ".has-no-placeholder .uitk-form-field-trigger")
    private WebElement destinationInput;
    @FindBy(css = "input#destination_form_field")
    private WebElement destinationInputSearch;
    @FindBy(css = "[data-stid] [data-stid='destination_form_field-result-item']:nth-of-type(1) strong")
    private WebElement destinationResult;
    @FindBy(css = "button#date_form_field-btn")
    private WebElement datesInput;
    @FindBy(css = ".uitk-calendar")
    private WebElement calendarPanel;
    @FindBy(css = "div:nth-of-type(1) > h2[class='uitk-date-picker-month-name uitk-type-medium']")
    private WebElement datesInputMonth1;
    @FindBy(css = "div:nth-of-type(2) > h2[class='uitk-date-picker-month-name uitk-type-medium']")
    private WebElement datesInputMonth2;
    @FindBy(css = ".uitk-date-picker-menu-pagination-container.uitk-layout-flex.uitk-layout-flex-justify-content-space-between > button:nth-of-type(1)")
    private WebElement datesInputPrevMonth;
    @FindBy(css = ".uitk-date-picker-menu-pagination-container.uitk-layout-flex.uitk-layout-flex-justify-content-space-between > button:nth-of-type(2)")
    private WebElement datesInputNextMonth;
    @FindBy(css = "div:nth-of-type(1) > .uitk-date-picker-weeks")
    private WebElement datesInputMonth1WeeksTable;
    @FindBy(css = "div:nth-of-type(2) > .uitk-date-picker-weeks")
    private WebElement datesInputMonth2WeeksTable;
    @FindBy(css = ".dialog-done.uitk-button.uitk-button-has-text.uitk-button-medium.uitk-button-primary.uitk-layout-flex-item.uitk-layout-flex-item-flex-shrink-0")
    private WebElement datesInputDoneButton;
    @FindBy(xpath = "//section/h3[contains(text(),'Room')]")
    private WebElement travellersInputRoomHeading;
    @FindBy(css = ".uitk-fake-input.uitk-form-field-trigger.uitk-menu-trigger")
    private WebElement travellersInput;
    @FindBy(xpath = "//input[@id='traveler_selector_adult_step_input-0']")
    private WebElement travellersInputAdultCount;
    @FindBy(css = "[aria-label='Decrease the number of adults in room 1']")
    private WebElement travellersAdultsMinus;
    @FindBy(css = "[aria-label='Increase the number of adults in room 1']")
    private WebElement travellersAdultsPlus;
    @FindBy(xpath = "//input[@id='traveler_selector_children_step_input-0']")
    private WebElement travellersInputChildCount;
    @FindBy(css = "[aria-label='Decrease the number of children in room 1']")
    private WebElement travellersChildrenMinus;
    @FindBy(css = "[aria-label='Increase the number of children in room 1']")
    private WebElement travellersChildrenPlus;
    @FindBy(xpath = "//select[contains(@name,'child-traveler_selector_children_age_selector-0-')]")
    private WebElement travellersChildrenAgeSelector;
    @FindBy(xpath = "//button[#'traveler_selector_add_room']")
    private WebElement travellerInputAddRoomLink;
    @FindBy(css = "button#traveler_selector_done_button")
    private WebElement travellersSelectionDoneButton;
    @FindBy(css = "button#submit_button")
    private WebElement submitButton;
    @FindBy(xpath = "//div[@id='gc-custom-header-nav-bar-acct-menu']/button[@type='button']")
    private WebElement signInMenuLink;
    @FindBy(xpath = "//a[@innertext='Sign in' and @data-stid='link-header-account-signin']")
    private WebElement signInLink;
    @FindBy(xpath = "//a[contains(., 'Sign up') and @data-stid='link-header-account-signup']")
    private WebElement signUpLink;

    public WebElement getCookiesBanner() {
        return cookiesBanner;
    }

    public WebElement getRejectCookiesButton() {
        return rejectCookiesButton;
    }

    public WebElement getDestinationInput() {
        return destinationInput;
    }

    public WebElement getDestinationInputSearch() {
        return destinationInputSearch;
    }

    public WebElement getDestinationResult() {
        return destinationResult;
    }

    public WebElement getDatesInput() {
        return datesInput;
    }

    public WebElement getDatesInputMonth1() {
        return datesInputMonth1;
    }

    public WebElement getDatesInputMonth2() {
        return datesInputMonth2;
    }

    public WebElement getDatesInputPrevMonth() {
        return datesInputPrevMonth;
    }

    public WebElement getDatesInputNextMonth() {
        return datesInputNextMonth;
    }

    public WebElement getDatesInputMonth1WeeksTable() {
        return datesInputMonth1WeeksTable;
    }

    public WebElement getDatesInputMonth2WeeksTable() {
        return datesInputMonth2WeeksTable;
    }

    public WebElement getDatesInputDoneButton() {
        return datesInputDoneButton;
    }

    public WebElement getTravellersInputRoomHeading() {
        return travellersInputRoomHeading;
    }

    public WebElement getTravellersInput() {
        return travellersInput;
    }

    public WebElement getTravellersInputAdultCount() {
        return travellersInputAdultCount;
    }

    public WebElement getTravellersAdultsMinus() {
        return travellersAdultsMinus;
    }

    public WebElement getTravellersAdultsPlus() {
        return travellersAdultsPlus;
    }

    public WebElement getTravellersInputChildCount() {
        return travellersInputChildCount;
    }

    public WebElement getTravellersChildrenMinus() {
        return travellersChildrenMinus;
    }

    public WebElement getTravellersChildrenPlus() {
        return travellersChildrenPlus;
    }

    public WebElement getTravellersChildrenAgeSelector() {
        return travellersChildrenAgeSelector;
    }

    public WebElement getTravellerInputAddRoomLink() {
        return travellerInputAddRoomLink;
    }

    public WebElement getTravellersSelectionDoneButton() {
        return travellersSelectionDoneButton;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public WebElement getSignInMenuLink() {
        return signInMenuLink;
    }

    public WebElement getSignInLink() {
        return signInLink;
    }

    public WebElement getSignUpLink() {
        return signUpLink;
    }

    public void rejectCookies() throws IOException {
        new WebDriverWait(getDriver(), Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(rejectCookiesButton)).click();
        //Assert.assertFalse(cookiesBanner.isDisplayed(), "Cookie banner is still displayed!");
    }

    public void validatePageLoaded() {
        Assert.assertTrue(destinationInput.isDisplayed(), "Destination input field is Missing.");
        Assert.assertTrue(datesInput.isDisplayed(), "Dates input field is missing.");
        Assert.assertTrue(travellersInput.isDisplayed(), "travellers input field is missing.");
    }

    public void validateSearchForDestination(String destination) {
        destinationInput.click();
        destinationInputSearch.sendKeys(destination);
        Assert.assertTrue(destinationResult.getText().contains(destination), "Search result does not contain search-term: " + destination);
        destinationResult.click();
    }

    public void validateDateSelectorOpen() throws InterruptedException {
        datesInput.click();
        Thread.sleep(200);
        Assert.assertTrue(calendarPanel.isDisplayed(), "Calendar panel has not been displayed.");
    }

    public void validateNavigateToMonth(LocalDate startDate) {
        LocalDate initialDate = LocalDate.now().plus(2, ChronoUnit.WEEKS);
        int monthsDiffStart = (int) initialDate.until(startDate).toTotalMonths();
        for (int i = 0; i < monthsDiffStart; i++) {
            datesInputNextMonth.click();
        }
        Assert.assertEquals(datesInputMonth1.getText().toLowerCase(),startDate.getMonth().toString().toLowerCase() + " " + startDate.getYear(),  "The wrong month has been selected.");
    }

    public void validateSelectStartDate(int startDay) {
        List<WebElement> startMonthDays = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfNestedElementsLocatedBy(datesInputMonth1WeeksTable, By.tagName("button")));
        startMonthDays.get(startDay - 1).click();
        Assert.assertEquals(startDay, Integer.parseInt(startMonthDays.get(startDay - 1).getAttribute("data-day")), "The wrong start day has been selected.");
    }

    public void validateSelectEndDate(int startDay, int endDay) {
        List<WebElement> endMonthDays;
        if (endDay <= startDay) {
            endMonthDays = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfNestedElementsLocatedBy(datesInputMonth2WeeksTable, By.tagName("button")));
        } else {
            endMonthDays = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfNestedElementsLocatedBy(datesInputMonth1WeeksTable, By.tagName("button")));
        }
        endMonthDays.get(endDay - 1).click();
        Assert.assertEquals(endDay, Integer.parseInt(endMonthDays.get(endDay - 1).getAttribute("data-day")), "The wrong end day has been selected.");
    }

    public void validateDateSelectorClose(){
        datesInputDoneButton.click();
        boolean calendarDisplayed;
        try {
            calendarPanel.isDisplayed();
            calendarDisplayed = true;
        } catch (NoSuchElementException nseEx){
            calendarDisplayed = false;
        }
        Assert.assertFalse(calendarDisplayed, "Calendar panel has not closed.");
    }

    public void validateBookingDates(LocalDate startDate, LocalDate endDate) {
        //get the pre-selected date

        //calculate the difference in months between currently selected date and booking start date

        //navigate to the correct month for booking start date

        //select the start date

        //calculate the difference in months between start date and end date

        //if > 0 navigate to correct month for end date

        //select end date

        //click 'done'
    }
}
