package hotels;

import base.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.hotels.Homepage;
import pages.hotels.ResultsPage;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class HomepageTest extends Hooks {

    Homepage home = new Homepage(getDriver());

    public HomepageTest() throws IOException {
        super();
    }

//    @DataProvider(name = "home-page-search-data")
//    public Object[][] homePageSearchData(){
//        return new Object[][] {
//                {"Newcastle", LocalDate.of(2022, 8, 29), LocalDate.of(2022, 9, 5), 1, 2, 3},
//                {},
//                {},
//                {}
//        };
//    }

    @Test
    public void verifyE2ESearch() throws IOException, InterruptedException {
        home.rejectCookies();
    }

    @Test
    public void verifyE2ESearch2() throws IOException, InterruptedException {
        LocalDate checkIn = LocalDate.of(2023, 6, 15);
        LocalDate checkOut = LocalDate.of(2023, 6, 19);
        home.validatePageLoaded();
        home.validateSearchForDestination("Newcastle");
        home.validateDateSelectorOpen();
        home.validateNavigateToMonth(checkIn);
        home.validateSelectStartDate(checkIn.getDayOfMonth());
        home.validateSelectEndDate(checkIn.getDayOfMonth(), checkOut.getDayOfMonth());
        home.validateDateSelectorClose();
    }

//        home.getRejectCookiesButton().click();
//        enterDetails("Newcastle", checkIn, checkOut, 1, 2, 3);
//        home.getSubmitButton().click();
//        ResultsPage rp = new ResultsPage();
//        Assert.assertEquals(rp.getDestinationInput().getAttribute("value"), "Newcastle-upon-Tyne, England, United Kingdom");
//        Assert.assertEquals(rp.getCheckInDateInput().getAttribute("aria-label"), "Check-in " + checkIn.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));
//        Assert.assertEquals(rp.getCheckOutDateInput().getAttribute("aria-label"), "Check-out " + checkOut.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));
//        Assert.assertEquals(rp.getTravellersDetailsInput().getAttribute("value"), 1 + " room, " + (2+3) + " travellers");
//    }

//    private void enterDetails(String destination, LocalDate bookingStartDate, LocalDate bookingEndDate, int numRooms, int numAdults, int numChildren) throws IOException, InterruptedException {
//        home.getDestinationInput().click();
//        home.getDestinationInputSearch().sendKeys(destination);
//        home.getDesitnationResult().click();
//        home.getDatesInput().click();
//        selectDates(bookingStartDate, bookingEndDate);
//        home.getDatesInputDoneButton().click();
//        home.getTravellersInput().click();
//        selectTravellers(numRooms, numAdults, numChildren);
//        home.getTravellersSelectionDoneButton().click();
//    }

//    private void selectTravellers(int rooms, int adults, int children) throws IOException {
//        int adultsCount = Integer.parseInt(home.getTravellersInputAdultCount().getAttribute("value"));
//        if(adultsCount < adults){
//            for(int i = adultsCount; i < adults; i++){
//                home.getTravellersAdultsPlus().click();
//            }
//        } else if( adultsCount > adults){
//            for(int i = adultsCount; i > adults; i--){
//                home.getTravellersAdultsMinus().click();
//            }
//        }
//
//        int childrenCount = Integer.parseInt(home.getTravellersInputChildCount().getAttribute("value"));
//        if(childrenCount < children){
//            for(int i = childrenCount; i < children; i++){
//                home.getTravellersChildrenPlus().click();
//            }
//        } else if( childrenCount > children){
//            for(int i = childrenCount; i > children; i--){
//                home.getTravellersChildrenMinus().click();
//            }
//        }
//
//        if(children > 0){
//            List<WebElement> ages = home.getTravellersChildrenAgeSelector();
//            for(WebElement we : ages){
//                Select ageSelection = new Select(we);
//                ageSelection.selectByVisibleText("6");
//            }
//        }
//    }

//    public void selectDates(LocalDate bookingStartDate, LocalDate bookingEndDate) throws IOException, InterruptedException {
//        LocalDate initialDate = LocalDate.now().plus(2, ChronoUnit.WEEKS);
//        int monthsDiffStart = (int) initialDate.until(bookingStartDate).toTotalMonths();
//        for (int i = 0; i < monthsDiffStart; i++) {
//            home.getDatesInputNextMonth().click();
//            Thread.sleep(50);
//        }
//        List<WebElement> startMonthDays = new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfNestedElementsLocatedBy(home.getDatesInputMonth1WeeksTable(), By.tagName("button")));
//        startMonthDays.get(bookingStartDate.getDayOfMonth() -1).click();
//
//        if(bookingEndDate.getMonthValue() != bookingStartDate.getMonthValue()){
//            int monthsDiffEnd = (int) bookingStartDate.until(bookingEndDate).toTotalMonths();
//            if(monthsDiffEnd == 0){
//                monthsDiffEnd = 1;
//            }
//            for (int i = 0; i < monthsDiffEnd; i++) {
//                home.getDatesInputNextMonth().click();
//                Thread.sleep(50);
//            }
//        }
//        List<WebElement> endMonthDays = new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfNestedElementsLocatedBy(home.getDatesInputMonth1WeeksTable(), By.tagName("button")));
//        endMonthDays.get(bookingEndDate.getDayOfMonth() -1).click();
//    }
}
